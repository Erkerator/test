import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Numbers> testList = Task3.countSequence(20);
        WriteToTxt writeToTxt = new WriteToTxt();
        String fileName = "text.txt";
        writeToTxt.writeToFile(testList, fileName);
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
