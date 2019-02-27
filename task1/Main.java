public class Main {

    public static void main(String[] args) {
        int testArray[] = Main.countSequence(20);
        for (int element:testArray)
            System.out.println(element);
    }

    private static int[] countSequence(int upperLimit) {
        int resultArray[] = new int[upperLimit];
        for (int i=0; i<upperLimit; i++) {
            resultArray[i] = i*i;
        }
        return resultArray;
    }
}



