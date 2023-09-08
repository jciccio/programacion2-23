import javax.swing.JOptionPane;

public class PruebaCalculadoraInterfaz {
	


	public static void main (String args[]){
		CalculadoraV2 calculadora = new CalculadoraV2();
		Interfaz interfaz = new Interfaz();

		String menu = "Elija una opción:\n1-Convertir de Km a Mi\n2-Convertir de Celsius a Farenheit\n3-Convertir de cm a pulg\n4-Convertir de kg a lb";
		int opcionDigitada = interfaz.solicitarNumeroEntero(menu);

		switch(opcionDigitada){
			case 1:
				double numero = interfaz.solicitarNumeroReal("Digite los km");
				double resultado = calculadora.convertirKmAMillas(numero);
				System.out.println ("El resultado es: "+ resultado);
				break;
			case 2: 
				int gradosC = interfaz.solicitarNumeroEntero("Digite los grados");
				resultado = calculadora.convertirCaF(gradosC);
				System.out.println ("El resultado es: "+ resultado);
				break;
			case 3: 
				numero = interfaz.solicitarNumeroReal("Digite los cm");
				System.out.println ("El resultado es: "+ calculadora.convertirCmAPulg(numero));
				break;
			case 4: 
				System.out.println ("El resultado es: "+ calculadora.convertirKgALb( interfaz.solicitarNumeroReal("Digite los kg")));
				break;
		}
		

	}
}