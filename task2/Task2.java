import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Numbers> testList = Task2.countSequence(20);

        for (Numbers element:testList)
            System.out.println(element);
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
