package tasks;

public class CalcImpl implements ICalculator {
    public double multi(double a, double b) {
        return a * b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public void voidM() {
    }
}