public class Estudiante{
	private String nombre;
	private int edad;

	public Estudiante (){
		nombre = "";
		edad = 0;
	}

	 //     Estudiante("Maria",                   19            );
	public Estudiante (String nombreParametro, int edadParametro){
		this.nombre = nombreParametro;
		this.edad = edadParametro;
	}

	public void saludar(){
		String contenido = "Hola me llamo "+ nombre;
		contenido = contenido + " y tengo " + edad + " anyos";
		System.out.println(contenido);
	}




}