public class Buscaminas{
	private int[][] tablero;
	//-1 => Representa una mina
	// 0-8 => Cantidad de minas alrededor

	public Buscaminas(int f, int c, int minas){
		if(f*c > minas){
			tablero = new int[f][c];
			while(minas > 0){
				int filaAleatoria = (int) (Math.random()*f);
				int columnaAleatoria = (int) (Math.random()*c);
				if(tablero[filaAleatoria][columnaAleatoria] != -1){
					tablero[filaAleatoria][columnaAleatoria] = -1;
					minas--;
				}
			}
		}
	}

	public String toString(){
		String contenido = "";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				if(tablero[f][c] == -1){
					contenido += "*";	
				}
				else if(tablero[f][c] == 0){
					contenido += "''";
				}
				else{
					contenido += tablero[f][c] ;
				}
				contenido += "\t";
			}
			contenido += "\r\n";
		}
		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,10);
		System.out.println(buscaminas);
	}

}