public class PruebaArreglo{
	public static void main (String args[]){
		int [] arreglo1 = new int [100];
		System.out.println(arreglo1);
		for(int i = 0; i < arreglo1.length; i++){
			System.out.println("La celda " + i + " del arreglo contiene: " + arreglo1[i]);
		}

		int [] arreglo2 = new int [10];
		String contenidoArreglo2 = "";
		for(int i = 0; i < arreglo2.length; i++){
			contenidoArreglo2 += arreglo2[i] + " ";
		}	
		System.out.println(contenidoArreglo2);

		for(int i = 0; i < arreglo2.length; i++){
			System.out.print(arreglo2[i] + " ");
		}	
		System.out.println();

		for(int i = 0; i < arreglo2.length; i++){
			arreglo2[i] = 1;
		}	
		for(int i = 0; i < arreglo2.length; i++){
			System.out.print(arreglo2[i] + " ");
		}

		for(int i = 0; i < arreglo2.length; i++){
			arreglo2[i] = i;
		}	
		System.out.println();
		for(int i = 0; i < arreglo2.length; i++){
			System.out.print(arreglo2[i] + " ");
		}
		System.out.println();
		arreglo2[3] = 123;

		for(int i = 0; i < arreglo2.length; i++){
			System.out.print(arreglo2[i] + " ");
		}
		System.out.println();

		String [] arregloStrings = new String [5]; 
		for(int i = 0; i < arregloStrings.length; i++){
			System.out.print(arregloStrings[i] + " ");
		}
		System.out.println();
		arregloStrings[2] = "Hola";
		for(int i = 0; i < arregloStrings.length; i++){
			System.out.print(arregloStrings[i] + " ");
		}
		System.out.println();

		arregloStrings[2] = null;
		for(int i = 0; i < arregloStrings.length; i++){
			System.out.print(arregloStrings[i] + " ");
		}
		System.out.println();
	}

}