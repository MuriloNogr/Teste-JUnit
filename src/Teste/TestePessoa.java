package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fiap.elevador.Pessoa;

public class TestePessoa {

	public class PessoaTest {
	    @Test
	    public void testCriarPessoa() {
	        Pessoa pessoa = new Pessoa("Murilo", 70.5);
	        assertEquals("Murilo", pessoa.getNome());
	        assertEquals(70.5, pessoa.getPeso(), 0.0001);
	    }
	}
}
