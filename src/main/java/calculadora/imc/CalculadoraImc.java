package calculadora.imc;

public class CalculadoraImc {
	
	double imc;
	
	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		imc = peso / (altura * altura);
		
		if ((imc >= 18.50) && (imc <=24.99))
		{
			return "Peso normal";
		}
		
		else
			return "Qualquer coisa";
	}
}
