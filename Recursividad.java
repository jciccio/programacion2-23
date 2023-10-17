public class Recursividad{
	public int calcularSumatoria(int x){
		int resultado = 0;
		if(x == 0){ // caso trivial, donde sabemos que el resultado es 0
			resultado = 0;
			System.out.println("En el caso base/trival");
		}
		else{
			// Caso recursivo
			// Queremos hacer el problema mas peq. para llegar al caso trivial
			// x-1;
			System.out.println("En el caso recursivo, antes de la llamada "+ x);
			resultado = x + calcularSumatoria(x-1);
			System.out.println("En el caso recursivo, despues de la llamada "+ x);
		}
		return resultado;
	}

	public static void main (String args[]){
		Recursividad r = new Recursividad();
		int resultado = r.calcularSumatoria(5);
		System.out.println("La sumatoria de 5 es: " + resultado);
	}
}