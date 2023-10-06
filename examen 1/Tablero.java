public class Tablero{
	// Imprimir Tablero
	// Metodo para agregar al tablero
	// - Recibe la direccion y la ficha

	// Lista (arreglo de fichas en donde se puede jugar)


	//       [6:6][6:3]

	// [1:3]

	private Ficha [] tablero;
	private int ultimoUsadoDer;
	private int ultimoUsadoIzq;

	public Tablero(){
		tablero = new Ficha[56];
		ultimoUsadoIzq = 56/2;
		ultimoUsadoDer = 56/2;
	}


	public void imprimir(){
		String contenido = "";
		for(int i = 0 ; i < tablero.length; i++){
			if(tablero[i] != null){
				contenido += tablero[i].toString();
			}
		}
		System.out.println(contenido);
	}

	// 0 - izq 
	// 1 - der
	// i = izq
	// d = der
	// Izquierda
	// Derecha
	// false = izq
	// true = derecha
	public boolean colocarFicha(Ficha ficha, boolean direccion){
		boolean esValida = false;
		// Si está vacío el tablero
		if(tablero[56/2] == null){
			if(ficha.getValor1() == ficha.getValor2()){
				tablero[56/2] = ficha;
				esValida = true;
			}
		}
		else{
			if(direccion){
				// Va para la derecha
				Ficha derecha = tablero[ultimoUsadoDer];
				if(derecha.getValor2() == ficha.getValor2()){
					ficha.voltearFicha();
				}
				if (derecha.getValor2() == ficha.getValor1()){
					esValida = true;
					ultimoUsadoDer++;
					tablero[ultimoUsadoDer] = ficha;
				}
			}
			else{
				// Va para la izquierda
				Ficha izquierda = tablero[ultimoUsadoDer];
				if(izquierda.getValor1() == ficha.getValor1()){
					ficha.voltearFicha();
				}
				if (izquierda.getValor1() == ficha.getValor2()){
					esValida = true;
					ultimoUsadoIzq--;
					tablero[ultimoUsadoIzq] = ficha;
				}
			}
		}
	}
}