public class PruebaArreglo2{
	public static void main (String [] args){

		int [] arreglo1 = new int [15];
		int [] arreglo2 = new int [5];
		int [] arreglo3 = new int [25];
		int [] arreglo4 = new int [30];
		Arreglo arreglo = new Arreglo();
		arreglo.imprimir(arreglo1);
		arreglo.imprimir(arreglo2);
		arreglo.imprimir(arreglo3);
		arreglo.imprimir(arreglo4);

		arreglo.asignarMultiplosDe5(arreglo1);
		arreglo.imprimir(arreglo1);

		int [] arreglo5 = arreglo.asignarMultiplosDe5Copia(arreglo2);
		arreglo.imprimir(arreglo5);

		System.out.println((int) (Math.random()*5));

		arreglo.revolver(arreglo5);
		arreglo.imprimir(arreglo5);
	}


}