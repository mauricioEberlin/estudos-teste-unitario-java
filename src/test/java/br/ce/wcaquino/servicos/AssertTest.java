package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		//Sempre colocar o ESPERADO primeiro, depois o "RECEBIDO".
		
		Assert.assertEquals("Erro de comparação", 1, 1);
		Assert.assertEquals(0.51234, 0.512, 0.001);
		
		int inteiro1 = 5;
		Integer inteiro2 = 5;
		Assert.assertEquals(Integer.valueOf(inteiro1), inteiro2);
		Assert.assertEquals(inteiro1, inteiro2.intValue());
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario");
		Usuario u2 = new Usuario("Usuario");
		Usuario u3 = u2;
		Usuario u4 = null;
		
		Assert.assertEquals(u1, u2);
		
		Assert.assertSame(u3, u2);
		Assert.assertNotSame(u1, u2);
		
		Assert.assertNull(u4);
		Assert.assertNotNull(u1);
		
		
	}
}
