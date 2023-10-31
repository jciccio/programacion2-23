public class Ahorcado{
	private String palabraSecreta;//paralelepipedo
	private StringBuilder patron; //??????????????
	private int intentosRestantes;//6

	public Ahorcado(String palabra){
		palabraSecreta = palabra;
		quitarAcentos();
		patron = new StringBuilder();
		for(int i = 0; i<palabraSecreta.length(); i++){
			patron.append("?");
		}
		intentosRestantes = 6;
	}

	public Ahorcado(String palabra, int intentos){
		palabraSecreta = palabra;
		patron = new StringBuilder();
		for(int i = 0; i<palabraSecreta.length(); i++){
			patron.append("?");
		}
		intentosRestantes = intentos;
	}

	public boolean buscarLetra(char letra){
		boolean encontrado = false;
		letra = (""+letra).toLowerCase().charAt(0);
		for(int i = 0 ; i < palabraSecreta.length(); i++){
			if(palabraSecreta.charAt(i) == letra){
				encontrado = true;
				patron.replace(i, i+1, ""+letra);
			}
		}
		return encontrado;
	}

	public void quitarAcentos(){
		String acentos = "áéíóú";
		String sinAcentos = "aeiou";
		palabraSecreta = palabraSecreta.toLowerCase();
		for(int i = 0 ; i < acentos.length(); i++){
			palabraSecreta = palabraSecreta.replace(acentos.charAt(i), sinAcentos.charAt(i));
		}
	}

	public boolean gano(){
		return patron.indexOf("?") == -1;
	}

	public void jugar(){
		Interfaz interfaz = new Interfaz();
		do{
			String letra = interfaz.solicitarHilera( patron.toString() + "\nIntentosRestantes: "+intentosRestantes+"\nDigite una letra");
			if(!buscarLetra(letra.charAt(0))){
				intentosRestantes--;
			}
		}while(intentosRestantes > 0 && !gano());
		String mensaje = gano() ? "Felicidades, Ganó :)" : "Perdió :("; 
		interfaz.mostrarDatos(mensaje, "Estado final");
	}

	public static void main(String args[]){
		LectorDeArchivos lector = new LectorDeArchivos("PalabrasSecretas.txt");
		String texto = lector.leerArchivo();
		System.out.println(texto);
		String [] palabras = texto.split("\n");
		System.out.println(palabras.length);
		
		Ahorcado ahorcado = new Ahorcado(palabras[(int)(Math.random()*palabras.length)].trim());
		ahorcado.jugar();
	}

}