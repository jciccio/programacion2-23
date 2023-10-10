public class Matriz{

	// Problema: queremos crear una matriz con letras del abecedario
	// un arreglo que tenga las letras del abecedario
	// tenemos que iterar sobre la matriz
	// necesitamos un contador que itere sobre el arreglo de letras
	// si el contador es 26 lo reiniciamos en 0
	public char [][] generarMatrizLetrasV1(int filas, int columnas){
		char [] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [][] matrizLetras = new char [filas][columnas];
		int contador = 0;
		for(int f = 0; f < matrizLetras.length; f++){
			for(int c = 0 ; c < matrizLetras[f].length; c++){

				matrizLetras[f][c] = letras[contador];
				contador++;
				if(contador == 26){
					contador = 0;
				}
			}
		}
		return matrizLetras;
	}


	public char [][] generarMatrizLetrasV2(int filas, int columnas){
		char [] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [][] matrizLetras = new char [filas][columnas];
		int contador = 0;
		for(int f = 0; f < matrizLetras.length; f++){
			for(int c = 0 ; c < matrizLetras[f].length; c++){
				matrizLetras[f][c] = letras[contador%letras.length];
				contador++;
			}
		}
		return matrizLetras;
	}

	public char [][] generarMatrizLetrasV3(int filas, int columnas){
		String letras = "abcdefghijklmnopqrstuvwxyz";
		char [][] matrizLetras = new char [filas][columnas];
		int contador = 0;
		for(int f = 0; f < matrizLetras.length; f++){
			for(int c = 0 ; c < matrizLetras[f].length; c++){
				matrizLetras[f][c] = letras.charAt(contador%letras.length());
				contador++;
			}
		}
		return matrizLetras;
	}

	public char [][] generarMatrizLetrasV4(int filas, int columnas){
		int contador = 0;
		char [][] matrizLetras = new char [filas][columnas];
		for(int f = 0; f < matrizLetras.length; f++){
			for(int c = 0 ; c < matrizLetras[f].length; c++){
				matrizLetras[f][c] = (char)(97 + contador);
				contador= (contador+1) % 26;
			}
		}
		return matrizLetras;
	}

	public int [][] transponer(int [][] matriz){
		// 1 2 3 => 2x3
		// 4 5 6
		// =>
		// 1 4 => 3x2
		// 2 5
		// 3 6

		int [][] resultado = new int [matriz[0].length][matriz.length]; 
		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0 ; c < matriz[f].length; c++){
				resultado[c][f] = matriz[f][c];
			}
		}
		return resultado;

	}

	public int [][] generarMatrizMultiplosColumnas(int filas, int columnas){
		// 5  20
		// 10 25
		// 15 30
		// filas * columnas => 2*3 => 6
		int base = 5;
		int [][] matriz = new int [filas][columnas];
		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0 ; c < matriz[f].length; c++){
				matriz[f][c] = base;
				base += 5;
			}
		}
		return transponer(matriz);
	}


	public void imprimir (){
		for (int f = 0; f < 2; f++){
			for (int c = 0; c < 4; c++){
				System.out.println ("Valor de F: " + f + " Valor de C: " + c);
			}
		}
	}	

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void imprimir (int [][] matriz){
		for (int f = 0; f < matriz.length; f++){// Itera por todas las filas => Cambia la columna hacia abajo
			for (int c = 0; c < matriz[f].length; c++){// Iterando por las columnas => imprime una fila completa
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void imprimir (char [][] matriz){
		for (int f = 0; f < matriz.length; f++){// Itera por todas las filas => Cambia la columna hacia abajo
			for (int c = 0; c < matriz[f].length; c++){// Iterando por las columnas => imprime una fila completa
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void main (String args[] ){
		int [][] matriz = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12,13}
		};

		int [][] matriz2 = new int [10][4];
		int [][] matriz3 = new int [4][10];
		Matriz instancia = new Matriz();
		instancia.imprimir(matriz);
		instancia.imprimir(matriz2);
		instancia.imprimir(matriz3);

		// Para cambiarle a matriz el valor del 3: tenemos que acceder 
		// a la fila 0, columna 2
		matriz[0][2] = 600;
		instancia.imprimir(matriz);
		System.out.println(matriz[1][2]);
		System.out.println(matriz[1]);
		int [] arreglo1 = matriz[1];
	 	instancia.imprimirArreglo(arreglo1);

	 	int [] arreglo2 = {10,20,30};
	 	matriz[3] = arreglo2;
	 	instancia.imprimir(matriz);

	 	char[][] matrizLetras1 = instancia.generarMatrizLetrasV1(4,5);
	 	instancia.imprimir(matrizLetras1);

	 	char[][] matrizLetras2 = instancia.generarMatrizLetrasV1(6,5);
	 	instancia.imprimir(matrizLetras2);

	 	matrizLetras2 = instancia.generarMatrizLetrasV2(6,5);
	 	instancia.imprimir(matrizLetras2);

	 	matrizLetras2 = instancia.generarMatrizLetrasV3(7,9);
	 	instancia.imprimir(matrizLetras2);

	 	System.out.println((char)97);


	 	matrizLetras2 = instancia.generarMatrizLetrasV4(10,4);
	 	instancia.imprimir(matrizLetras2);

		int [][] matrizT = {
			{1,2,3},
			{4,5,6},
		};	 	
		instancia.imprimir(instancia.transponer(matrizT));


		instancia.imprimir(instancia.generarMatrizMultiplosColumnas(3,5));

	}
}