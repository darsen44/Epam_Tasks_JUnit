package tasks;

public class CalcController {
    private ICalculator calculator;

    public CalcController(ICalculator calculator) {
        this.calculator = calculator;
    }

    public CalcController() {
    }

    public double sum(double input1, double input2) {
        return calculator.sum(input1, input2);
    }

    public double sub(double input1, double input2) {
        return calculator.sub(input1, input2);
    }

    public double multi(double input1, double input2) {
        return calculator.multi(input1, input2);
    }

    public double div(double input1, double input2) {
        return calculator.div(input1, input2);
    }
    public void voidM(){}
}
