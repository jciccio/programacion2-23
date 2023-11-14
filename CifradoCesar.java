public class CifradoCesar{
	private String frase;

	public CifradoCesar(String frase){
		this.frase = frase;
	}

	public void setFrase(String frase){
		this.frase = frase;
	}

	public String getFrase(){
		return this.frase; 
	}

	public String cifrar(int corrimiento){
		String letras = "abcdefghijklmnñopqrstuvwxyz";
		String cifrado = "";
		for(int i = 0; i < frase.length(); i++){
			String letra = (""+frase.charAt(i)).toLowerCase();
			int posicion = letras.indexOf(letra);
			String letraFinal = ""+frase.charAt(i);
			if(posicion != -1){
				int posicionFinal = posicion+corrimiento >= 0 ? posicion+corrimiento : letras.length()+posicion+corrimiento;
				String letraConCorrimiento = ""+ letras.charAt((posicionFinal)%letras.length());
				letraFinal = (letras.charAt(posicion) == frase.charAt(i)) ? letraConCorrimiento : letraConCorrimiento.toUpperCase(); 
			}
			cifrado += letraFinal;
		}
		return cifrado;
	}

	public static void main (String args[]){
		CifradoCesar cifrado = new CifradoCesar("Holaz!98");
		System.out.println(cifrado.cifrar(3));

		CifradoCesar cifrado2 = new CifradoCesar("Krñdc!98");
		System.out.println(cifrado2.cifrar(-3));

		String menu = "Bienvenido, digite el número de una opción:\n1-Cifrar\n2-Descifrar\n3-Salir";
		Interfaz i = new Interfaz();
		
		int opcion = 0;
		do{
			opcion = i.solicitarNumeroEntero(menu);
			switch(opcion){
				case 1:
				case 2:
					int corrimiento = i.solicitarNumeroEntero("Digite el corrimiento");
					String palabra = opcion == 1 ? "codificar" : "decodificar";
					corrimiento *= opcion == 1 ? 1 : -1;
					String frase = i.solicitarHilera("Digite la frase a "+palabra);
					cifrado.setFrase(frase);
					i.mostrarDatos(cifrado.cifrar(corrimiento), "Resultado");
					System.out.println(cifrado.cifrar(corrimiento));
				
				break;
				case 3:
					i.mostrarDatos("Gracias por utilizar el programa", "Adiós");
				break;
				default:
					i.mostrarDatos("La opción digitada no es válida", "Atención");
			}
		}while(opcion != 3);
		


	}
}