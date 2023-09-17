public class Circulo{
	private static final float PI = 3.1415;

	public double calcularArea(double diametro){
		double radio = diametro / 2;
		return PI * radio * radio;
	}

}