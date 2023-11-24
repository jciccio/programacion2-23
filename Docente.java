public class Docente extends Persona {
	private int codigo;
	private String unidadAcademica;

	public Docente (String nombre, int codigo, String unidadAcademica){
		super(nombre);
		this.codigo = codigo;
		this.unidadAcademica = unidadAcademica;
	}	

	public void saludar(){
		System.out.println( "Docente: "+ nombre + " de la unidad de " + unidadAcademica);
	}

	public void saludar2(){
		System.out.println( "Hola soy: "+ nombre + " de la unidad de " + unidadAcademica + " y mi codigo es: "+ codigo);
	}

	public static void main (String args[]){
		Docente d1 = new Docente( "Jose", 123, "Computacion");
		d1.saludar();

		Docente d2 = new Docente( "Maria", 231, "Economia");

		Persona p1 = new Persona("Allan");
		Persona p2 = new Persona("Genesis");
		Persona p3 = new Persona("Juan Pablo");
	
		Persona  [] personas = new Persona [5];
		personas[0] = d1; 
		personas[1] = d2;
		personas[2] = p1;
		personas[3] = p2;
		personas[4] = p3;

		System.out.println(personas[0].getClass());
		System.out.println(personas[3].getClass());

		if(personas[4] instanceof Persona){
			System.out.println("Persona[4] es de tipo persona");
		}

		for(int i = 0 ; i < personas.length; i++){
			if(personas[i] instanceof Docente){
				Docente d = (Docente) personas[i];
				d.saludar2();
			}
			else{
				personas[i].saludar();	
			}
			
		}
	}
}