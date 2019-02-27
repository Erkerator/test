import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class WriteToXml extends WriteToFile {

    private static WriteToXml INSTANCE = new WriteToXml();

    private WriteToXml() {}

    public static WriteToXml getInstance() {
        return INSTANCE;
    }

    //полиморфизм - переопределеный метод
    @Override
    public void writeToFile(List<Numbers> listOfNumbers, String fileName) throws ParserConfigurationException, TransformerException, FileNotFoundException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element numbers = document.createElement("numbers");
        document.appendChild(numbers);
        for (Numbers element:listOfNumbers) {

            Element number = document.createElement("value");
            Element isEven = document.createElement("isEven");
            Text numberValue = document.createTextNode(Integer.toString(element.getValueOfNumber()));
            Text parameterOfNumber = document.createTextNode(Boolean.toString(element.isEven()));

            numbers.appendChild(number);
            numbers.appendChild(isEven);
            number.appendChild(numberValue);
            isEven.appendChild(parameterOfNumber);
        }
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream(fileName)));
    }
}
