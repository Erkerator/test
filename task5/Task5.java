import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<Numbers> testList = Task5.countSequence(10);
        WriteToTxt writeToTxt = WriteToTxt.getInstance();
        WriteToXml writeToXml = WriteToXml.getInstance();
        String xmlFileName = "temp.xml";
        String txtFileName = "text.txt";
        writeToTxt.writeToFile(testList, txtFileName);
        try {
            writeToXml.writeToFile(testList, xmlFileName);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Task5.satisfiedSize(txtFileName);
            Task5.satisfiedSize(xmlFileName);
        } catch (SizeException e) {
            e.printStackTrace();
        }
    }
    // инкапсуляция поведения
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

    private static boolean satisfiedSize(String fileName) throws SizeException {
        File file = new File(fileName);
        long fileSize = file.length();
        long maxFileSize = 1100;
        if (fileSize < maxFileSize) {
            return false;
        } else {
            throw new SizeException("File cannot be more than " + maxFileSize + " bytes");
        }
    }
}


