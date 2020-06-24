package mediaTest;

import org.junit.Assert;
import org.junit.Test;

import media.CalculoMedia;





public class Media {
	@Test
	public void validaReprovado() {
		CalculoMedia calculoMedia = new CalculoMedia(5, 5);
		String situacao = calculoMedia.getSituacao();
		Assert.assertEquals("Reprovado", situacao);
	}
	
	@Test
	public void validaAprovado() {
		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.setNota1(7);
		calculoMedia.setNota2(7);
		Assert.assertEquals("Aprovado", calculoMedia.getSituacao());
	}
	
	@Test
	public void assertTrue() {
		boolean x = false;
		
		Assert.assertTrue(x);
	}
	
	@Test
	public void assertTrue2() {
		boolean x = false;
		
		Assert.assertEquals(true, x);
	}
	
	@Test
	public void erro() throws Exception {
		throw new Exception("Simulação de Erro!");
	}
	
	
	
	
}
