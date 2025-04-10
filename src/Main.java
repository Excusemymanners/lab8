import calculatoare.NewIntCalculator;
import calculatoare.DoubleCalculator;
import org.junit.jupiter.api.*;


public class Main {
    public static void main(String[] args) {

        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        int intResult = (Integer) intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultat Int: " + intResult); // Output: 24


        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);
        double doubleResult = (Double) doubleCalc.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("Rezultat Double: " + doubleResult); // Output: 24.64



    }
}
