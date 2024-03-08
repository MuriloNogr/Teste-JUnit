package Teste;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.fiap.elevador.Elevador;
import br.com.fiap.elevador.Pessoa;

public class TesteElevador {
	
	@Test
    public void testEntrarNoElevador() {
        Elevador elevador1 = new Elevador(1, 500.0, 200.0, false);
        Pessoa pessoa1 = new Pessoa("Murilo", 70.1);
        assertEquals(270.1, elevador1.entrarNoElevador(elevador1.getCargaAtual(), pessoa1.getPeso()), 0.0001);
    }
    
    @Test
    public void testSairDoElevador() {
        Elevador elevador2 = new Elevador(1, 500.0, 200.0, false);
        Pessoa pessoa2 = new Pessoa("Murilo", 70.1);
        assertEquals(129.9, elevador2.sairNoElevador(elevador2.getCargaAtual(), pessoa2.getPeso()), 0.0001);
    }
    
    @Test
    public void testAvaliarPeso() {
        Elevador elevador3 = new Elevador(1, 500.0, 600.0, false);
        assertTrue(elevador3.avaliarPeso());
    }
}
