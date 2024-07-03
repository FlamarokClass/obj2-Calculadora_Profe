package ar.edu.unahur.po2.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void quePuedaDividir() throws Exception {
		Calculadora calcu = new Calculadora();
		Integer dividendo = 5;
		Integer divisor = 5;
		Integer valorEsperado = 1;
		Integer valorObtenido = calcu.dividir(dividendo,divisor);
		assertEquals(valorEsperado,valorObtenido);

	}	
	@Test (expected = NoSePuedeDividirPorCeroException.class)
	public void queNoPuedaDividirPorCero() throws Exception {
		Calculadora calcu = new Calculadora();
		Integer dividendo = 5;
		Integer divisor = 0;
		calcu.dividir(dividendo,divisor);	
	}	
	
}
