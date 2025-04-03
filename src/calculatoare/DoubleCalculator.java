package calculatoare;

public class DoubleCalculator extends ACalculator {

    @Override
    public void init(Number value) {
        if (value instanceof Double) {
            this.state = value.doubleValue();
        } else {
            throw new IllegalArgumentException("DoubleCalculator acceptă doar Double!");
        }
    }

    public DoubleCalculator add(double number) {
        state = (Double) state + number;
        return this;
    }

    public DoubleCalculator subtract(double number) {
        state = (Double) state - number;
        return this;
    }

    public DoubleCalculator multiply(double number) {
        state = (Double) state * number;
        return this;
    }
}
