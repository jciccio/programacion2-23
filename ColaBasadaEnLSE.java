public class ColaBasadaEnLSE{
	
	private ListaSimplementeEnlazada lista;
	private int cantidadDeElementosActuales;

	public ColaBasadaEnLSE(){
		lista = new ListaSimplementeEnlazada();
		cantidadDeElementosActuales = 0;
	}

	public void  agregar(int elemento){
		lista.agregarAlFinal(elemento);
		cantidadDeElementosActuales++;
	}

	public void eliminar(){
		lista.eliminar(0);
		if(cantidadDeElementosActuales > 0)
			cantidadDeElementosActuales--;
	}

	public int getCantidad(){
		return cantidadDeElementosActuales;
	}
}