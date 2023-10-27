public class Buscaminas{
	private int[][] tablero;
	private String [][] tableroUsuario;
	private int minas;
	//-1 => Representa una mina
	// 0-8 => Cantidad de minas alrededor

	public Buscaminas(int f, int c, int minas){
		if(f*c > minas){
			this.minas = minas;
			tablero = new int[f][c];
			tableroUsuario = new String [f][c];		
			for(int fila = 0 ; fila < tablero.length; fila++){
				for(int col = 0; col <tablero[fila].length; col++){
					tableroUsuario[fila][col] = "_";
				}
			}

			while(minas > 0){
				int filaAleatoria = (int) (Math.random()*f);
				int columnaAleatoria = (int) (Math.random()*c);
				if(tablero[filaAleatoria][columnaAleatoria] != -1){
					tablero[filaAleatoria][columnaAleatoria] = -1;
					minas--;
				}
			}
			llenarTablero();
		}
	}

	public boolean realizarMovimiento(int f, int c, boolean perdio){
		if(f >= 0 && c >= 0 && 
		   f < tablero.length && 
		   c < tablero[f].length){ // Casos base o triviales
			if(tablero[f][c] == -1){ // Caemos en una mina
				perdio = true;
				tableroUsuario[f][c] = "M";
			}
			else if(tablero[f][c] > 0){  // caso trivial
				tableroUsuario[f][c] = ""+tablero[f][c];
				perdio = false;
			}
			else if(tableroUsuario[f][c] == "_"){
				tableroUsuario[f][c] = "" + tablero[f][c];
				int [] cF = {-1,-1,-1,0,0,1,1,1};
				int [] cC = {-1,0,1,-1,1,-1,0,1};
				int contador = 0;
				while (contador < cF.length){
					int nuevaF = f + cF[contador];
					int nuevaC = c + cC[contador];				
					perdio = realizarMovimiento(nuevaF, nuevaC, perdio);
					contador += 1;
				}
			}

		}
		return perdio;
	}

	public void llenarTablero(){
		int [] cF = {-1,-1,-1,0,0,1,1,1};
		int [] cC = {-1,0,1,-1,1,-1,0,1};
		for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c <tablero[f].length; c++){
				if(tablero[f][c] == -1){
					for(int i = 0; i < 8; i++){
						int nuevaF = f + cF[i];
						int nuevaC = c + cC[i];
						if(nuevaF >= 0 && nuevaF < tablero.length &&
						nuevaC >=0 && nuevaC  < tablero[nuevaF].length &&
						tablero[nuevaF][nuevaC] != -1){
							tablero[nuevaF][nuevaC]++;
						}
					}
				}
			}
		}
	}

	public boolean verificarGanador(){
		// El jugador gana si la cantidad de minas es igual a la de espacios no visitados
		// Vamos a contar los camoos no visitados "_"
		int camposSinDesbloquear = 0;
		for(int f = 0 ; f < tableroUsuario.length; f++){
			for(int c = 0; c < tableroUsuario[f].length; c++){
				if (tableroUsuario[f][c].equals("_")){
					camposSinDesbloquear++;
				}
			}
		}
		return camposSinDesbloquear == minas;
	}

	public String toString(){
		String contenido = "";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				contenido += tablero[f][c] ;
				contenido += " \t";
			}
			contenido += "\r\n";
		}

		contenido += "\r\n - - -  Tablero Usuario - - - - - \r\n";
		for(int fila = 0 ; fila < tableroUsuario.length; fila++){
			for(int col = 0; col <tableroUsuario[fila].length; col++){
				contenido += tableroUsuario[fila][col] + " \t";
			}
			contenido += "\r\n";
		}

		return contenido;
	}

	public void jugar(){
		Interfaz interfaz = new Interfaz();
		boolean perdio, gano;
		do{
			int fila = interfaz.solicitarNumeroEntero (toString()+ "\r\nDigite la fila");
			int columna = interfaz.solicitarNumeroEntero(toString()+ "\r\nDigite la columna");
			// Pedir una fila
			// Pedir una columna
			// Realizar el movimiento
			perdio = realizarMovimiento(fila, columna, true);
			// Verificar si gana
			gano = verificarGanador();
			// Ciclo de lo anterior
			interfaz.mostrarDatos(toString(), "Estado del juego");
		}while(!gano && !perdio);
		String mensaje = gano ? "Felicidades, ganó el juego" : "Perdio :("; 
		interfaz.mostrarDatos(mensaje, "Estado del juego");
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,1);
		/*System.out.println(buscaminas);
		buscaminas.llenarTablero();
		System.out.println(buscaminas);
		buscaminas.realizarMovimiento(0,0,true);
		System.out.println(buscaminas);
		System.out.println(buscaminas.verificarGanador());*/
		buscaminas.jugar();
	}

}