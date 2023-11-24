public class Cola{

	private Nodo primero; // Puntero al inicio de la lista (primer nodo)
	private int cantidadDeElementosActuales;


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

	public Cola(){
		primero = null;
	}


	public void  agregar(int elemento){
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
		cantidadDeElementosActuales++;
	}

	public int borrar() throws ColaVaciaException{
		// Casos para borrar un nodo:
		// Si es el primer nodo (elemento 0) -> necesitamos acualizar el puntero al inicio
		// Si es un nodo intermedio
		// Si es el nodo final
		int eliminado = 0;
		if(this.primero != null){
			Nodo temporal = this.primero;
			this.primero = this.primero.siguiente;
			temporal.siguiente = null;
			temporal = null;
			eliminado = temporal.valor;
			cantidadDeElementosActuales--;
		}
		else{
			throw new ColaVaciaException("La cola se encuentra vacia");
		}
		return eliminado;
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
		Cola cola = new Cola();
		try{
			cola.borrar();	
		}
		catch(ColaVaciaException e){
			System.err.println(e);
		}
		
	}

}