public class Mazo {
	
	public Mazo (){
		// Generar una carta
		//  -> dar valor (numero, palo)
		// Imprimir en pantalla
		for(int j = 0 ; j < 4 ; j++){
			for(int i = 1; i <= 13; i++){
				Carta carta = new Carta(i, obtenerPalo(j));
				System.out.println(carta);
			}	
		}
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

	public static void main (String args[]){
		Mazo mazo = new Mazo();
	}
}