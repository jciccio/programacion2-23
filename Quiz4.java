public class Quiz4 {
	
	// Pregunta 1
	public int redondear(double numeroReal){
		int numeroEntero = (int) numeroReal; // Para obtener la parte entera, realizamos casting
		// Si al realizar la resta, el valor es >= 0.5, debemos sumar una unidad, en caso contrario, mantenemos
		// El valor entero. Para esto, utilizando el operador ternario condicion ? true : false, realizamos
		// la asignación y retornamos el resultado
		return (numeroReal - numeroEntero) >= 0.5 ? numeroEntero + 1 : numeroEntero;
	}

	// Pregunta 2
	public double calcularValorPi(int n){
		double aproximacionPi = 0; // Variable que contiene el resultado
		if(n > 0){ // Si el valor de N es negativo, retornaremos 0
			double denominador = 1; // El denominador aumenta de 2 en 2 unidades, necesitamos que sea un valor real
			int signo = 1; // El signo lo cambiamos al multiplicar por -1, inicia con un valor positivo
			for(int i = 0 ; i < n; i++){
				aproximacionPi += (1/denominador * signo); // La fracción * el signo, se le suma a la aproximación
				denominador += 2;// Por cada iteración se le suman dos unidades
				signo *= -1; // Se realiza el cambio de signo
			}
			aproximacionPi *= 4; // Sobre todas las operacions (sumas y restas) se debe multiplicar el resultado por 4
		}
		return aproximacionPi; // Se retorna el valor de la aproximación
	}

	// Pruebas para las preguntas del quiz
	public static void main (String args[]){
		Quiz4 q4 = new Quiz4();
		System.out.println("6.21 => " + q4.redondear(6.21));
		System.out.println("5.61 => " + q4.redondear(5.61));
		System.out.println("10.5 => " + q4.redondear(10.5));
		System.out.println("10.51 => " + q4.redondear(10.51));
		System.out.println("10.49 => " + q4.redondear(10.49));
		System.out.println("10.4999999 => " + q4.redondear(10.4999999));

		System.out.println("Aproximacion Pi N=3 es: " + q4.calcularValorPi(3));
		System.out.println("Aproximacion Pi N=30 es: " + q4.calcularValorPi(30));
		System.out.println("Aproximacion Pi N=300 es: " + q4.calcularValorPi(300));
		System.out.println("Aproximacion Pi N=3000 es: " + q4.calcularValorPi(3000));
		System.out.println("Aproximacion Pi N=30000 es: " + q4.calcularValorPi(30000));
		System.out.println("Aproximacion Pi N=3000000 es: " + q4.calcularValorPi(3000000));
		System.out.println("Aproximacion Pi N=300000000 es: " + q4.calcularValorPi(300000000));
	}

}