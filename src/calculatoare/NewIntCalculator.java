package calculatoare;

public class NewIntCalculator extends ACalculator {

    @Override
    public void init(Number value) {
        if (value instanceof Integer) {
            this.state = value.intValue();
        } else {
            throw new IllegalArgumentException("NewIntCalculator acceptă doar Integer!");
        }
    }

    public NewIntCalculator add(int number) {
        state = (Integer) state + number;
        return this;
    }

    public NewIntCalculator subtract(int number) {
        state = (Integer) state - number;
        return this;
    }

    public NewIntCalculator multiply(int number) {
        state = (Integer) state * number;
        return this;
    }
}
