public class OchoReinas{	
	private int [][] tablero;
	
	public OchoReinas(){
		tablero = new int [8][8]; 
	}

	public boolean revisarColisiones(int f, int c){
		int [] cF = {1,-1, 0, 0, 1,-1,-1, 1};
		int [] cC = {0, 0, 1,-1, 1, 1,-1,-1};
		int i = 0;
		boolean valido = true;
		while(i < cF.length && valido){
			valido = revisarColision(f,c,cF[i], cC[i]);
			i++;
		}
		return valido;
	}

	private boolean revisarColision(int fila, int col, int dirF, int dirC){
		boolean valido = true;
		if( valido && fila >= 0 && fila < tablero.length && 
			col >=0 && col < tablero[fila].length){
			if(tablero[fila][col] == -1){
				valido = false;
			}
			else{
				valido = revisarColision(fila+dirF,col+dirC, dirF, dirC);
			}
		}
		return valido;
	}

	public int colocarFicha(int fila, int columna, int cantidad){
		if (fila >= 0 && fila < tablero.length && 
			columna >=0 && columna < tablero[fila].length){

			boolean valido = revisarColisiones(fila, columna);
			if(valido && cantidad >= 8){ // Caso trivial
				tablero[fila][columna] = -1;
			}
			else if(valido){
				tablero[fila][columna] = -1;
				System.out.println("Valido, agregado en columna: "+ columna +" fila " +  fila+" cantidad: " + cantidad);
				cantidad = colocarFicha(0, columna+1, cantidad+1);
				if(cantidad < 8){
					tablero[fila][columna] = 0;
					cantidad--;
					System.out.println("La cantidad es menor que 8, quitando ficha de fila: " + fila +" col "+columna);
					System.out.println("- - Intentanto en fila: "+ (fila+1) + " columna "+columna +" cantidad: " + cantidad);
					cantidad = colocarFicha(fila+1, columna, cantidad);
				}
			}
			else{ // moverse por las filas buscando una posición válida
				System.out.println("- - NO Valido, cantidad: " + cantidad + " fila " + fila + " columna " + columna);
				cantidad = colocarFicha(fila+1, columna, cantidad);
			}
		}
		return cantidad;
	}

	public String toString(){
		String contenido = "";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				contenido += tablero[f][c] + "\t";
			}
			contenido += "\n";
		}
		return contenido;
	}

	public static void main (String args[]){
		OchoReinas reinas = new OchoReinas();
		System.out.println("Colocadas final: " + reinas.colocarFicha(0,0,0));
		System.out.println(reinas);
	}

}