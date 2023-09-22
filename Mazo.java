public class Mazo {

	private Carta [] carta;
	
	public Mazo (){
		// Generar una carta
		//  -> dar valor (numero, palo)
		// Imprimir en pantalla
		carta = new Carta[52];
		int celda = 0;
		for(int j = 0 ; j < 4 ; j++){
			for(int i = 1; i <= 13; i++){
				//Carta carta = new Carta(i, obtenerPalo(j));
				carta[celda] = new Carta(i, obtenerPalo(j));
				celda++;
			}	
		}
	}

	public String toString(){
		String contenido = "";
		for(int i = 0 ; i < carta.length; i++){
			contenido += carta[i];
		}
		return contenido;
	}
	

	public String obtenerPalo(int numero){
		String palo = "Espadas";
		if(numero == 0){
			palo = "Espadas";
		}
		else if(numero == 1){
			palo = "Corazones"; 
		} else if (numero == 2){
			palo = "Treboles"; 
		}
		else {
			palo = "Diamantes"; 
		}
		return palo;
	}

	public void revolver (){
		for(int i = 0 ; i < carta.length ; i++){
			int numeroAleatorio = (int) (Math.random()*carta.length);
			Carta temporal = carta[i];
			carta[i] = carta[numeroAleatorio];
			carta[numeroAleatorio] = temporal;
		}
	}

	public static void main (String args[]){
		Mazo mazo = new Mazo();
		System.out.println(mazo);
		mazo.revolver();
		System.out.println("- - - - -");
		System.out.println(mazo);
	}
}