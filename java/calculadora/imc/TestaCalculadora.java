package calculadora.imc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaCalculadoraImc {

	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	@Test
	public void testeAdultoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(77.25, 2.03, 21, "feminino"));
	}
	
	@Test
	public void testeAdultoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(63.97, 1.6, 64, "masculino"));
	}
}
