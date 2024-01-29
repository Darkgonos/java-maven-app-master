import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    @Test
    public void testAddition() {
        AppTest calculator = new AppTest();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        AppTest calculator = new AppTest();
        assertEquals(2, calculator.subtract(5, 3));
    }


    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("Calcul");
    }
}
