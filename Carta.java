public class Carta {
	// atributos de clase
	// Declaracion de atributos:
   	private String palo; // un atributo de tipo texto que contiene el palo
   	private int numero; // un atributo de tipo entero que contiene el numero


   	public Carta(){
   		System.out.println("-> Se invoca al constructor por omision");
   		numero = 7;
   		palo = "Corazones";
   	}

   	public Carta(int numeroParametro){
   		System.out.println("-> Se invoca al constructor que recibe el numero");
   		numero = numeroParametro;
   		palo = "Corazones";
   	}
   	// Constructor de clase

   	public Carta (int numeroParametro, String paloParametro){
   		System.out.println("-> Se invoca al constructor que recibe el numero y el palo");
   		numero = numeroParametro;
   		palo = paloParametro;
   	}

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

	public String getNumeroSwitch(){
		String valorCarta = "";
		switch(this.numero){
			// 1 -> As, 11-> J, 12 -> Q, 13 -> K
			case 1:
				valorCarta = "As";
			break; 
			case 11:
				valorCarta = "J";
			break;
			case 12: 
				valorCarta = "Q";
			break;
			case 13:
				valorCarta = "K";
			break;
			default:
				valorCarta += this.numero;
		}
		return valorCarta;
	}

	public String getNumeroIfElse(){
		String valorCarta = "";

		if(numero == 1){
			// Se ejecuta si numero es exactamente 1
			valorCarta = "As";
		}
		else{
			// Si el numero NO es uno se ejecuta este bloque
			if(numero == 11){
				// Se ejecuta si numero es exactamente 11
				valorCarta = "J";
			}
			else{
				// Se ejecuta si numero NO es 11
				if(numero == 12){
					// Se ejecuta si numero es exactamente 12
					valorCarta = "Q";
				}
				else{
					if (numero == 13){
						// Se ejecuta si el número es exactamente 13
						valorCarta = "K";
					}
					else{
						// Es el resto
						valorCarta += numero;
					}
				}
			}
		}

		return valorCarta;
	}

	public String toString(){
		return "La carta es: " +  getNumeroIfElse() + " de " + palo;
	}


}