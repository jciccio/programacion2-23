public class Arreglo{
	public void imprimir(int [] arreglo){
		for(int i = 0 ; i< arreglo.length; i++){
			System.out.print(arreglo[i] + " "); // print no realiza cambio de linea
		}
		System.out.println(); // imprime un cambio de linea
	}

	public void asignarMultiplosDe5(int [] arreglo){
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = (i+1)*5;
		}
		//return arreglo;
	}

	public int [] asignarMultiplosDe5Copia(int [] arregloParametro){
		int [] arreglo = new int[arregloParametro.length];
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = (i+1)*5;
		}
		return arreglo;
	}

	public int[] revolver (int [] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			int numeroAleatorio = (int) (Math.random()*arreglo.length);
			int temporal = arreglo[i];
			arreglo[i] = arreglo[numeroAleatorio];
			arreglo[numeroAleatorio] = temporal;
		}
		return arreglo;
	}
}