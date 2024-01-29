import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;


public class Calcul {

    @Test
    public void testApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}