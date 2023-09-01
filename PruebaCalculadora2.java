
public class PruebaCalculadora2 {
	public static void main (String args[]){
		CalculadoraV2 calculadora = new CalculadoraV2();
		Interfaz interfaz = new Interfaz();

		int num1 = interfaz.solicitarNumeroEntero("Digite el primer número");
		int num2 = interfaz.solicitarNumeroEntero("Digite el segundo número");

		int suma = calculadora.sumar(num1, num2);
		int resta = calculadora.restar(num1, num2);

		String mensaje = "Calculadora:\nNumero 1: "+num1 + "\nNumero 2:" + num2;
		mensaje = mensaje + "\n- La suma es: " + suma + "\n- La resta es: " + resta;
		interfaz.mostrarDatos(mensaje, "Resultados"); 
	}
}