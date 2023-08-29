public class PruebaEstudiante{
	
	public static void main (String [] args){
		Estudiante estudiante1 = new Estudiante();
		estudiante1.saludar();

		Estudiante estudiante2 = new Estudiante("Alejandro", 24);
		estudiante2.saludar();
	}

}