public class Matematicas{
	

	public int calcularExponente(int base, int exponente){
		int resultado = 1;
		for(int i = 0 ; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	public int calcularCantidadDeDigitos(int numero){
		int contador = 0;
		while(numero / 10 != 0){
			contador++;
			numero /= 10;
		}
		return contador;
	}

	/*123/10 -> 12
		123%10 -> 3 => p + (cantidadDigitos-1)
		12/10 -> 1
		12%10 -> 2 => p + cantidadDigitos - 2 
		1/10 -> 0
		1%10 -> 1 => p + cantidadDigitos - 3
		123, 5
		1^5
		2^6
		3^7*/
	public int calcularNumeroPotencia(int n, int p){
		int cantidadDigitos = calcularCantidadDeDigitos(n);
		int copiaN = n;
		int total = 0;
		int i = 1;
		while(i <= cantidadDigitos){
			int digito = copiaN % 10;
			total += calcularExponente(digito, (p+cantidadDigitos-i));
			i++;
			copiaN /= 10;
		}
		return total%n == 0 ? total/n : -1;
	}

	public int calcularNumeroPotencia2(int n, int p){
		String numeroHilera = (""+n); 
		int total = 0;
		for(int i = 0; i < numeroHilera.length(); i++){
			int digito = Integer.parseInt(""+numeroHilera.charAt(i));
			total += calcularExponente(digito,p);
			p++;
		}
		return total%n == 0 ? total/n : -1;
	}

}