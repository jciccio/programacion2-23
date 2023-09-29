public class Hileras{

	//"hola mundo mundo"
	//"Hola Mundo Mundo"
	public String titleize(String hilera){
		String  resultado = "";
		String [] partes = hilera.split(" ");
			//"Hola  Mundo"
			//Hola
			//
			//Mundo
		for(int i = 0 ; i < partes.length; i++){
			// 26
			//System.out.println(partes[i].length());
			if(partes[i].length() > 0){
				char letra = partes[i].charAt(0);
				String letraString = "" + letra;
				resultado += letraString.toUpperCase() + partes[i].substring(1);
				if(i != partes.length-1){
					resultado+= " ";
				}
			}
		}
		return resultado;
	}


	public static void main (String args[]){
		String hilera1 = "\tHola mundo\n";
		hilera1 += " mundo";
		System.out.println(hilera1);
		hilera1 = hilera1.toUpperCase();
		//System.out.println(hilera2);
		System.out.println(hilera1.length());

		for(int i = 0;  i < hilera1.length(); i++){
			System.out.println(hilera1.charAt(i));
		}

		char [] arreglo = hilera1.toCharArray();
		System.out.println("- - - - - -");
		for(int i = 0;  i < arreglo.length; i++){
			System.out.println(arreglo[i]);
		}
		System.out.println("- - - - - -");
		for(int i = 0;  i < arreglo.length; i++){
			if(arreglo[i] == 'M'){
				arreglo[i] ='Z';
			}
		}

		for(int i = 0;  i < arreglo.length; i++){
			System.out.print(arreglo[i]);
		}

		String hilera2 = "";
		for(int i = 0;  i < arreglo.length; i++){
			hilera2  += arreglo[i];
		}	

		System.out.println(hilera2);	

		System.out.println("- - - - - -");
		Hileras instanciaHilera = new Hileras();
		String hileraArreglada = instanciaHilera.titleize("hola  mundo mundo mundo mundo a a");
		System.out.println(hileraArreglada);

		byte letraByte = (byte)'A';
		System.out.println((char)(letraByte+32));
	}
}