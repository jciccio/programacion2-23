public class Ficha{
	private int valor1;
	private int valor2;

	public Ficha(int v1, int v2){
		valor1 = v1;
		valor2 = v2;
	}

	public void setValor1(int valor1){
		this.valor1 = valor1;
	}

	public void setValor2(int valor2){
		this.valor2 = valor2;
	}

	public int getValor1(){
		return valor1;
	}
	public int getValor2(){
		return valor2;
	}
	public String toString(){
		return "[" + valor1 + ":" + valor2 + "]";
	}

	public void imprimir(){
		System.out.println(toString());
	}

	public void voltearFicha(){
		int temporal = valor1;
		valor1 = valor2;
		valor2 = temporal;
	}

}