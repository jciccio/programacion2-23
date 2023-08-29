public class Calculadora{
	// sumar 
	// resta
	// multiplicar
	// dividir

	private double numero1;
	private double numero2; 
	private double resultado; // resultado de la operacion entre numero1 y numero2
	private double mem1;
	private double mem2;


	public void setNumero1 (double numero1){
		this.numero1 = numero1;
	}
	
	public void setNumero2(double numero2)
	{
		this.numero2 = numero2;
	}

	public double getTotal(){
		return resultado;
	}

	public void sumar(){
		resultado = numero1 + numero2;
	}

	public void restar(){
		resultado = numero1 - numero2;
	}

	public void multiplicar(){
		resultado = numero1 * numero2;
	}

	public void elevarAlCuadrado(){
		resultado = numero1 * numero1;
	}

	public void dividir (){
		resultado = numero1 / numero2;
	}

	public void calcularPromedio(){
		sumar();
		resultado = resultado / 2;
	}
}