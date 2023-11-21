public class MazoLSE{
	
	private Nodo primero; // Puntero al inicio de la lista (primer nodo)

	// Necesitamos un nodo
	private class Nodo{
		private Carta carta;
		private Nodo siguiente;

		public Nodo(Carta carta){
			this.carta = carta;
			this.siguiente = null;
		}

		public String toString(){
			return "Nodo: " + this.carta;
		}
	}

	public MazoLSE(){
		primero = null;
	}

	public void generarCartas(){
		String [] simbolos = {"Espadas", "Treboles", "Diamantes", "Corazones"};
		for(int j = 0 ; j < 4 ; j++){
			for(int i = 1; i <= 13; i++){
				this.agregarAlFinal(new Carta(i, simbolos[j]));
			}	
		}
	}

	public void revolver(){
		Nodo actual = this.primero;

		while(actual != null){
			int celda = (int)(Math.random()*52);
			Nodo cambio = this.buscarPosicion(celda);

			Carta temporal = actual.carta;
			actual.carta = cambio.carta;
			cambio.carta = temporal;

			actual = actual.siguiente;
		}
	}



	public void agregarAlInicio(Carta elemento){
		// 1 Crear un nodo
		// 2 Agregar el siguiente  al nodo que creamos
		// 3 Actualizar el primer elemento
		Nodo nuevo = new Nodo(elemento);
		// Forma 1
		nuevo.siguiente = primero;
		this.primero = nuevo;
		// Forma 2
		//Nodo primeroViejo = this.primero;
		//primero = nuevo;
		//nuevo.siguiente = primeroViejo;
	}

	public void agregarAlFinal(Carta elemento){
		// Queremos crear un nodo
		Nodo nuevo = new Nodo(elemento);
		if(this.primero == null){
			this.primero = nuevo;
		}
		else{ // Iterar hasta encontrar el último elemento
			Nodo actual = this.primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public Nodo buscarAnterior(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null && posicionActual + 1 != posicion){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public Nodo buscarPosicion(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null && posicionActual != posicion){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public boolean insertar(int posicion, Carta elemento){
		boolean insertado = false;
		if(posicion == 0){
			this.agregarAlInicio(elemento);
			insertado = true;
		}
		else if(posicion > 0 && this.primero != null){
			// Nodo es intermedio (a la mitad)
			// Nodo es final (el ultimo)
			Nodo anterior = this.buscarAnterior(posicion);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				insertado = true;
			}
		}
		return insertado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar un nodo:
		// Si es el primer nodo (elemento 0) -> necesitamos acualizar el puntero al inicio
		// Si es un nodo intermedio
		// Si es el nodo final
		boolean borrado = false;
		if(posicion >= 0 && this.primero != null){
			if(posicion == 0){
				Nodo temporal = this.primero;
				this.primero = this.primero.siguiente;
				temporal.siguiente = null;
				temporal = null;
				borrado = true;
			}
			else{
				Nodo actual = this.buscarAnterior(posicion);
				if(actual != null){
					Nodo borrar = actual.siguiente;
					if(borrar == null || borrar.siguiente == null){
						// Nodo final o terminal
						actual.siguiente = null;
						borrar =null;
						borrado = true;
					}
					else{
						// Nodo intermedio
						actual.siguiente =borrar.siguiente;
						borrar.siguiente = null;
						borrar = null;
						borrado = true;
					}
				}
			}
		}
		return borrado;
	}

	public Carta buscarCarta(String palo, int numero){
		Nodo actual = this.primero;
		int posicion = -1;
		Carta retorno = null;
		int i = 0;
		while(actual != null){
			if(palo.equals(actual.carta.getPalo()) && numero == actual.carta.getNumero()){
				posicion = i;
				retorno = actual.carta;
			}
			i++;
			actual = actual.siguiente;
		}
		return retorno;
	}

	public String toString(){
		String contenido = "";
		Nodo actual = this.primero;
		while(actual != null){
			contenido += actual.toString() + "\n";
			actual = actual.siguiente;
		}
		return contenido;
	}

	public static void main (String args[] ){
		MazoLSE lse = new MazoLSE();
		
		lse.generarCartas();

		lse.revolver();
		

		System.out.println(lse);
	}

}