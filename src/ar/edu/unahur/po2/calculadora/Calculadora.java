package ar.edu.unahur.po2.calculadora;

public class Calculadora {

	public Integer dividir(Integer dividendo, Integer divisor) throws Exception  {
		if (divisor!=0) {
			return dividendo/divisor;
		}
		throw new NoSePuedeDividirPorCeroException("No se puede dividir por cero");
	}		
}
