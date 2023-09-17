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

	public double calcularPotencia(int base, int potencia){
		int contador = potencia;
		double total = (potencia==0&&base==0)? 0.0 : 1.0;
		if(potencia < 0){
			contador *= -1;
		}
		for(int i = contador; i > 0; i--){
			total *= base;
		}
		if(potencia < 0){
			total = 1/total;
		}
		return total;
	}

	// si se pasa un numero negativo, la funcion retorna 0
	public long calcularFactorial(int numero){
		long total = (numero > 0) ? 1l : 0l; // operador ternario
		/*if(numero > 0){
			total = 1;
		}
		else{
			total = 0;
		}*/
		int contador = 1;
		while(contador <= numero){
			total *= contador; 
			contador++;
		}
		return total;
	}

	public double calcularSeno(int x, int iteraciones ){
		double seno = 0.0;
		int signo = 1;
		int valor = 1;
		for(int i = 0; i < iteraciones; i++){
			double numerador = calcularPotencia(x, valor);
			long denominador = calcularFactorial(valor);
			valor += 2;
			seno += (numerador/denominador) *signo;
			signo *= -1;
		}
		return seno;
	}




	public static void main (String args[]){
		CalculadoraV2 c1 = new CalculadoraV2();
		System.out.println(c1);
		System.out.println(c1.sumar(3.14159, 4.1));	

		System.out.println(c1.calcularPromedio(6, 4));	
	}
}