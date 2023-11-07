public class ListaSimplementeEnlazada{
	private Nodo primero; // Puntero al inicio de la lista (primer nodo)

	// Necesitamos un nodo
	private class Nodo{
		private int valor;
		private Nodo siguiente;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
		}

		public String toString(){
			return "Nodo: " + this.valor;
		}
	}

	public ListaSimplementeEnlazada(){
		primero = null;
	}

	public void agregarAlInicio(int elemento){
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

	public void  agregarAlFinal(int elemento){
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

	public boolean insertar(int posicion, int elemento){
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
		ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
		lse.agregarAlInicio(10);
		lse.agregarAlInicio(5);
		lse.agregarAlInicio(4);
		lse.agregarAlInicio(3);
		lse.agregarAlInicio(2);
		lse.agregarAlInicio(1);

		lse.agregarAlFinal(12);
		lse.insertar(1,20);
		lse.insertar(8,21);
		lse.insertar(9,42);
		lse.insertar(0,76);

		System.out.println(lse);
	}

}