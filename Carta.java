public class Carta{
	// atributos de clase
	// Declaracion de atributos:
   	private String palo; // un atributo de tipo texto que contiene el palo
   	private int numero; // un atributo de tipo entero que contiene el numero

	// Metodos

	// Set

	 //Declaracion de un método:
   	//1. Si es publico o privado (accesible desde la instancia)
   	//2. Qué quiero que retorne el metodo
   	//3. Cómo se llama el método
   	//4. Qué necesito que reciba el método para funcionar
	public void setPalo(String valorDelPalo){
		this.palo = valorDelPalo;
	}

	public void setNumero(int numeroParametro){
		this.numero = numeroParametro;
	}

	// Get
	public String getPalo(){
		return this.palo;
	}

	public int getNumero(){
		return this.numero;
	}


}