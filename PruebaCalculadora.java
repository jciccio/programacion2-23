public class PruebaCalculadora{
	public static void main (String [] args){
		Calculadora calculadora1 = new Calculadora();
		calculadora1.setNumero1(7.25);
		calculadora1.setNumero2(16.2367);
		calculadora1.sumar();
		double suma = calculadora1.getTotal();
		System.out.println("La suma es: " + suma);
		calculadora1.setNumero1(suma);
		calculadora1.sumar();
		System.out.println("La suma es: " + calculadora1.getTotal());

		double total = calculadora1.getTotal();

		System.out.println("Numero 2 es: " + total);
		calculadora1.setNumero2(total);

		calculadora1.multiplicar();
		System.out.println("La multiplicacion es: " + calculadora1.getTotal());

		calculadora1.elevarAlCuadrado();
		System.out.println("El valor elevado es: " + calculadora1.getTotal());

		calculadora1.dividir();
		System.out.println("La division es: " + calculadora1.getTotal());


		calculadora1.restar();
		System.out.println("La resta es: " + calculadora1.getTotal());		
	}
}