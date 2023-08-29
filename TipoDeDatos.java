

public class TipoDeDatos2432432  {
	public static void main (String args[]){

		System.out.println("Hola\nmundo");
		System.out.println("Hola\\nmundo");
		System.out.println("Hola mundo \u0040");
		

		// Tipo de dato
		// Nombre de la variable
		// = valor (inicializa la variable)
		// ;
		String miHilera = "Esta es mi variable: miHilera";
		System.out.println(miHilera);
		int numeroEntero1 = 12;
		System.out.println(numeroEntero1);
		numeroEntero1 = numeroEntero1 + 5;
		System.out.println(numeroEntero1);

		int numeroEntero2 = numeroEntero1 * 8;
		System.out.println("variable numeroEntero1: " + numeroEntero1);
		System.out.println("variable numeroEntero2: " + numeroEntero2);

		String hileraNumero = "10";
		System.out.println(hileraNumero + 1);
		int numeroEntero3 = Integer.parseInt(hileraNumero);
		System.out.println(numeroEntero3+1);

		// Descomentar esto provoca un error 
		// ya que hileraNumero2 no es un número
		// String hileraNumero2 = "10a";
		// int numeroEntero4 = Integer.parseInt(hileraNumero2);
		System.out.println(numeroEntero3+1);
		System.out.println(5/3);
		System.out.println((double)5/3);
		System.out.println(5.0/3);


		int numero1 = 10;
		System.out.println("Hola Mundo");

		String miHilera1 = "El Numero 1 es: " + numero1;
		System.out.println(miHilera1);
		numero1 = numero1 + 5;
		System.out.println("Numero 1 ahora tiene almacenado el valor de " + numero1);

		int y = numero1 * numero1;
		System.out.println("Y vale: " + y);

		y = 0;
		System.out.println("Y vale: " + y);

		double numeroReal1 = 3.999999999;
		System.out.println("numeroReal1: " + numeroReal1);
		int conversionEntera = (int)numeroReal1;
		System.out.println("conversionEntera: " + conversionEntera);

		Carta carta1 = new Carta();
		carta1.setPalo("Corazones");
		carta1.setNumero(5);

		int num = carta1.getNumero();
		String paloCarta = carta1.getPalo();

		System.out.println("Valores de la carta Carta " + num + " el palo es: " + paloCarta );

	}
} 