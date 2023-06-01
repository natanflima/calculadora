
package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteCalculadora {
    
    @Test
    public void testGetAdicao(){
        Calculadora calculadora = new Calculadora(4.0,2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
