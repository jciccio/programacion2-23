public class ListaDoblementeEnlazada {
	private Nodo primero;
	private Nodo ultimo;

	private class Nodo{
		private int valor;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo(int valor){
			this.valor = valor;
			siguiente = anterior = null;
		}

		public String toString(){
			return ""+valor;
		}
	}

	public ListaDoblementeEnlazada(){
		this.primero = this.ultimo = null;
	}



	public boolean setValor(int posicion, int valor){
		int posicionActual = 0;
		Nodo actual = this.primero;
		boolean asignado = false;
		if(posicion >= 0){
			while(actual != null && posicionActual != posicion){
				posicionActual++;
				actual = actual.siguiente;
			}
			if(actual != null){
				actual.valor = valor;
				asignado = true;
			}
		}
		return asignado;
	}

	public Nodo buscarNodo(int posicion){
		Nodo actual = this.primero;
		int posicionActual = 0;
		while(posicionActual != posicion && actual != null){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	//{a,d,e,g,u,m,z,c,j,s}
	//           m
	//       g u   z c    

	public Nodo buscarNodo(char letra, Nodo actual){
		Nodo retorno = null;
		if(actual != null){
			if(letra == actual.valor){
				// Caso trivial
				retorno = actual;
			}
			else{
				retorno = buscarNodo(letra,actual.siguiente);
			}
		}
		return retorno;
	}

	public String buscarValores(char letra, int rango){
		Nodo nodo = buscarNodo(letra); // m
		Nodo inicial = nodo;
		// Correr hacia la izquierda * rango veces
		int corrimiento = 0;
		while(inicial.anterior != null && corrimiento < rango){
			inicial = inicial.anterior;
			corrimiento++;
		}
		String resultado = "";
		corrimiento = 0;
		while(inicial != null && corrimiento < rango*2+1){
			if (inicial.valor != nodo.valor){
				resultado += inicial.valor;
				corrimiento++;
			}
			inicial = inicial.siguiente;
			
		}
		return resultado;
	}

}