import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void debeSumarDosNumeros() {
        int resultado = 2 + 3;

        assertEquals(5, resultado);
    }
}