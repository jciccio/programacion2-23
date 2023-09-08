public class PruebaPerro{
	
	public static void main (String args[]){
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Toby");
		Perro perro3 = new Perro("Max", "Corriendo!");

		String datosPerro3 = perro3.saludar();
		System.out.println(datosPerro3);

		perro2.correr();
		System.out.println(perro2.saludar());


		//System.out.println(perro1.saludar());
		perro1.bautizar("Coraje");
		//System.out.println(perro1.saludar());
		perro1.sentarse();
		System.out.println(perro1.saludar());


	}
}