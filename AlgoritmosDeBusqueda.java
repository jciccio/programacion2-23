import java.time.Instant;
import java.time.Duration;

public class AlgoritmosDeBusqueda{
	
	public int busquedaSecuencial(int [] arreglo, int valor){
		int posicion = -1;
		int contador = 0;
		while(contador < arreglo.length && posicion == -1){
			if(arreglo[contador] == valor){
				posicion = contador;
			}
			contador++;
		}
		return posicion;
	}

	public int busquedaBinaria(int [] arreglo, int valor){
		return busquedaBinaria(arreglo, valor, 0, arreglo.length);
	}

	private int busquedaBinaria(int [] arreglo, int valor, int limInf, int limSup){
		int resultado = -1;
		int celda = (limInf+limSup)/2;
		if(limInf <= limSup && celda >= 0 && celda < arreglo.length){
			if(arreglo[celda] == valor){
				// Caso trivial, encontramos el valor
				resultado = celda;
			}
			else if(arreglo[celda] > valor){
				// Caso recursivo 1
				resultado = busquedaBinaria(arreglo, valor, limInf, celda-1);
			}
			else{
				// Caso recursivo 2
				resultado = busquedaBinaria(arreglo, valor, celda+1, limSup);
			}
		}
		return resultado;
	}


	public static void main (String args[]){
		int [] arreglo1 = {1,2,4,6,8,9,15,20,50,90};
		AlgoritmosDeBusqueda ab = new AlgoritmosDeBusqueda();
		System.out.println(ab.busquedaBinaria(arreglo1,20));
		System.out.println(ab.busquedaBinaria(arreglo1,99));

		System.out.println("Ejecutando busquedas para calcular tiempos...");
		int [] arreglo2 = new int [1000000000];
		for(int i = 0 ; i < arreglo2.length; i++){
			arreglo2[i] = 2*i;
		}

		Instant tiempoInicial = Instant.now();
		int indice = ab.busquedaSecuencial(arreglo2,1);
		Instant tiempoFinal = Instant.now();
		long tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo de busqueda secuencial: "+ tiempoTranscurrido/1000.0);


		tiempoInicial = Instant.now();
		indice = ab.busquedaBinaria(arreglo2,1);
		tiempoFinal = Instant.now();
		tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo de busqueda binaria: "+ tiempoTranscurrido/1000.0);
	}


}