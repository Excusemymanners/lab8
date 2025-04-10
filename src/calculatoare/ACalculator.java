// Pachetul calculatoare
package calculatoare;
import org.junit.jupiter.api.*;

// Clasă abstractă ACalculator
public abstract class ACalculator {
    protected Object state; // Variabilă generică pentru stocarea rezultatului

    public Object result() {
        return state; // Returnează starea curentă
    }

    public void clear() {
        state = null; // Resetează starea
    }

    public abstract void init(Number value); // Metodă abstractă pentru inițializare
}
