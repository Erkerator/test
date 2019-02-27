public class Numbers {

    private int valueOfNumber;
    private boolean isEven;

    public Numbers (int number, boolean parameter) {
        this.valueOfNumber = number;
        this.isEven = parameter;
    }

    public int getValueOfNumber() {
        return valueOfNumber;
    }

    public void setValueOfNumber(int valueOfNumber) {
        this.valueOfNumber = valueOfNumber;
    }

    public boolean isEven() {
        return isEven;
    }

    public void setEven(boolean even) {
        isEven = even;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "valueOfNumber=" + valueOfNumber +
                ", isEven=" + isEven +
                '}';
    }
}
