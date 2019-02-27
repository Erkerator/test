public class Numbers {

    private int valueOfNumber;
    private boolean isEven;

    public Numbers (int number, boolean parameter) {
        this.valueOfNumber = number;
        this.isEven = parameter;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "valueOfNumber=" + valueOfNumber +
                ", isEven=" + isEven +
                '}';
    }
}
