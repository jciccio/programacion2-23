public class CalculadoraV2{
	public double sumar(double numero1, double numero2){
		return numero1 + numero2;
	}

	public int sumar(int numero1, int numero2){
		return numero1 + numero2;
	}

	public double restar(double numero1, double numero2){
		return numero1 - numero2;
	}

	public int restar(int numero1, int numero2){
		return numero1 - numero2;
	}

	public double calcularPromedio(double numero1, double numero2){
		return sumar(numero1, numero2)/2;
	}

	// cm -> pulg 0.3937
	// 1 pulg -> 2.54

	// km -> mi 1.609

	// kg a lb -> 2.205

	// c a f -> 9/5x + 32

	public double convertirKmAMillas(double km){
		double millas = km / 1.609;
		return millas;
	}

	public double convertirCmAPulg(double cm){
		double pulgadas = cm * 1/2.54;
		return pulgadas;
	}

	public double convertirCaF(int c){
		double farenheit = ((double)9 / 5.0) * c + 32;
		return farenheit;
	}

	public double  convertirKgALb(double kg){
		double libras = kg * 2.205;
		return libras; 
	}




	public static void main (String args[]){
		CalculadoraV2 c1 = new CalculadoraV2();
		System.out.println(c1);
		System.out.println(c1.sumar(3.14159, 4.1));	

		System.out.println(c1.calcularPromedio(6, 4));	
	}
}