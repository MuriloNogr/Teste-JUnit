package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fiap.elevador.Calculadora;

public class TesteCalculadora {

	@Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.somar(2.0, 3.0), 0.0001); 
    }
    
    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.0, calc.subtrair(2.0, 3.0), 0.0001);
    }

}
