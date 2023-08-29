public class CalculadoraV2{
	public double sumar(double numero1, double numero2){
		return numero1 + numero2;
	}

	public double restar(double numero1, double numero2){
		return numero1 - numero2;
	}

	public double calcularPromedio(double numero1, double numero2){
		return sumar(numero1, numero2)/2;
	}


	public static void main (String args[]){
		CalculadoraV2 c1 = new CalculadoraV2();
		System.out.println(c1);
		System.out.println(c1.sumar(3.14159, 4.1));	

		System.out.println(c1.calcularPromedio(6, 4));	
	}
}