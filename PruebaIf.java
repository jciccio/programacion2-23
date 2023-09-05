public class PruebaIf{
	
	public static void main (String args[]){

		Interfaz interfaz = new Interfaz();

		int nota = interfaz.solicitarNumeroEntero("Digite su nota");

		if(nota >= 67.5){
			System.out.println ("Pasa");
		}
		else {
			if (nota < 57.5){
				System.out.println ("Se queda");
			}
			else {
				System.out.println ("Va a ampliacion");
			}
		}


		int color = interfaz.solicitarNumeroEntero("Conversor a colores\n0-> rojo\n1-> verde\n2-> azul");

		// 0 -> rojo
		// 1 -> verde
		// 2 -> azul
		if (color == 0){
			System.out.println("El color es rojo");
		}
		if (color == 1){
			System.out.println("El color es verde");
		}
		if (color == 2){
			System.out.println("El color es azul");
		}



	}

}