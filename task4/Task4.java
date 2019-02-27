import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<Numbers> testList = Task4.countSequence(20);
        WriteToTxt writeToTxt = WriteToTxt.getInstance();
        WriteToXml writeToXml = WriteToXml.getInstance();
        String xmlFileName = "temp.xml";
        String fileName = "text.txt";
        writeToTxt.writeToFile(testList, fileName);
        try {
            writeToXml.writeToFile(testList, xmlFileName);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<Numbers> countSequence(int upperLimit) {
        ArrayList<Numbers> resultList = new ArrayList<>();
        for (int i=0; i<upperLimit; i++) {
            int number = i*i;
            Numbers numberClass = new Numbers(number, checkIsEven(number));
            resultList.add(numberClass);
        }
        return resultList;
    }

    private static boolean checkIsEven(int number) {
        if ((number%2) == 0)
            return true;
        else
            return false;
    }
}


