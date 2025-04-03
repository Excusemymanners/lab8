package calculatoare;

public class IntCalculator {
    private int value;


    public IntCalculator(int value) {
        this.value = value;
    }

    public IntCalculator add(int number) {
        this.value += number;
        return this; // Returnează obiectul pentru method chaining
    }

    // Metoda pentru scădere
    public IntCalculator subtract(int number) {
        this.value -= number;
        return this;
    }

    // Metoda pentru înmulțire
    public IntCalculator multiply(int number) {
        this.value *= number;
        return this;
    }

    // Returnează rezultatul final
    public int result() {
        return this.value;
    }
}
