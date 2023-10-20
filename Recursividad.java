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

	/*
	Calculo de serie Fibonacci
	Caso Base/Trivial
	f(0) = 0
	f(1) = 1
	Caso Recusivo:
	f(n) = f(n-1) + f(n-2)
	*/
	// n representa el valor en la sucesión
	// resultado =>    	    0 1 1 2 3 5 8 13
	// n => 				0 1 2 3 4 5 6 7
	private long calcularFibonacci(int n, long [] cache){
		long resultado = 0l;
		// casos base o triviales
		if(n <= 0){
			resultado = 0;
		}
		else if(n == 1){
			resultado = 1;
		}
		else{
			if(cache[n] != 0){
				resultado = cache[n];	
			}
			else{
				resultado = calcularFibonacci(n-1, cache) + calcularFibonacci(n-2, cache);
				cache[n] = resultado;	
				System.out.println("Calculando Fibo de: " + n);
			}

		}
		return resultado;
	}
	
	public long calcularFibonacci(int n){
		long resultado = 0;
		if (n > 0){
			long [] cache = new long [n+1]; 
			resultado = calcularFibonacci(n, cache);
		}
		return resultado;
	}

	public void calcularHanoi(int n, int origen, int intermedio, int destino){
		if(n == 1){
			System.out.println("Mover el disco " + n + " desde " + origen + " hasta " + destino);
		}
		else{
			calcularHanoi(n-1, origen, destino, intermedio);
			System.out.println("Mover el disco " + n + " desde " + origen + " hasta " + destino);
			calcularHanoi(n-1, intermedio, origen, destino);
		}
	}

	public static void main (String args[]){
		Recursividad r = new Recursividad();
		int resultado = r.calcularSumatoria(5);
		System.out.println("La sumatoria de 5 es: " + resultado);

		System.out.println("Fibonacci(5): " + r.calcularFibonacci(5));
		System.out.println("Fibonacci(7): " + r.calcularFibonacci(7));

		System.out.println("Fibonacci(100): " + r.calcularFibonacci(100));

		r.calcularHanoi(3,1,2,3);
	}
}