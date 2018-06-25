public class Calculator {
    private int inputone;
    private int inputtwo;

    public Calculator(int inputone, int inputtwo) {

        this.inputone = inputone;
        this.inputtwo = inputtwo;
    }

    public int getInputOne() {
        return this.inputone;
    }

    public int getInputTwo() {
        return this.inputtwo;
    }

    public int addNumbers() {
        return inputone + inputtwo;
    }

    public int subtractNumbers() {
        return inputone - inputtwo;
    }

    public int divideNumbers() {
        return inputone / inputtwo;
    }

    public int multiplyNumbers() {
        return inputone * inputtwo;
    }


}