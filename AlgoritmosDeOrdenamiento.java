public class AlgoritmosDeOrdenamiento{
	public void imprimir(int [] arreglo){
		for (int i = 0; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}
	public int [] clonar (int [] arreglo){
		int [] copia = new int[arreglo.length];
		for(int i = 0; i < arreglo.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}
	public int [] ordenarSeleccion(int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0; i < copia.length; i++){
			for(int j = i+1; j < copia.length; j++){
				if(copia[i] > copia[j]){
					int temporal = copia[i];
					copia[i]=copia[j];
					copia[j]=temporal;
				}
			}
		}
		return copia;
	}
	public int [] ordenarBurbujaLadrillo(int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0; i < copia.length; i++){
			for(int j = 1; j < copia.length; j++){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
				}
			}
		}
		return copia;
	}

		public int [] ordenarBurbuja(int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0; i < copia.length; i++){
			for(int j = copia.length - 1 ; j > i; j--){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
				}
			}
		}
		return copia;
	}

	public static void main (String [] args){
		AlgoritmosDeOrdenamiento ao = new AlgoritmosDeOrdenamiento();
		int [] arregloDesordenado = {1,10,50,3,-9,4999,29,80,100,549,11,1,0};
		ao.imprimir(ao.ordenarSeleccion(arregloDesordenado));
		ao.imprimir(ao.ordenarBurbuja(arregloDesordenado));
	}
}