import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class WriteToFile {
    public abstract void writeToFile(List<Numbers> listOfNumbers, String fileName) throws ParserConfigurationException, TransformerException, FileNotFoundException;
}
