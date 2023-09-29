public class Matematicas{
	
	// 2 -> 1 2
	// 5 -> 1 5
	// 10 -> 1 10 (2 5)
	public boolean esPrimo(int numero){
		// Dividir consecutivamente
		// Si el numero es divisor invalida que sea primo
		// Sacar los pares de una vez -> Optimización
		boolean primo = (numero >= 2);
		int contador = 2;
		while(primo && contador <= numero/2){
			if(numero%contador == 0){
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	public void imprimirPrimosHasta(int n){
		for(int i = 2;i <= n; i++){
			if(esPrimo(i)){
				System.out.println(i + " es primo");	
			}
		}
	}

	public int[] obtenerPrimosHasta(int n){
		int [] primos = null;
		int cantidad = 0;
		for(int i = 2; i <= n; i++){
			if(esPrimo(i)){
				cantidad++;	
			}
		}
		if(cantidad > 0){
			primos = new int[cantidad];
			int celda = 0;	
			for(int i = 2; i <= n; i++){
				if(esPrimo(i)){
					primos[celda] = i;
					celda++;
				}
			}
		}
		return primos;
	}

	// Imprimir exponenciales
	// Base, exponente
	// 2,3  => 8
	public int calcularExponente(int base, int exponente){
		int resultado = 1;
		for(int i = 0 ; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	public static void main (String [] args){
		Matematicas mate = new Matematicas();
		for(int i = 0 ; i < args.length ; i++){
			System.out.println("Argumentos: " + args[i]);
		}

		int base = Integer.parseInt(args[0]);
		int exponente = Integer.parseInt(args[1]);		

		System.out.println(mate.calcularExponente(base,exponente));

	}
}