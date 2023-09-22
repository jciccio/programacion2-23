public class Perro{
	
	// Atributos (sustantivos)
	// Para definir un atributo necesitamos:
	// Declarar un valor privado
	// Declarar el tipo de dato (entero, real, hilera, objetos, etc)
	// Definir un nombre para la variable (usando camelCase)
	// ;
	private String nombre;
	private String estado;

	// Metodos
	// Constructor de clase
	// Un metodo que se ejecuta solo una vez al inicializar la instancia
	// public 
	// El nombre de la clase
	// Parametros para inicializar valores

	// Perro perro1 = new Perro();
	public Perro(){
		this.nombre = "";
		this.estado = "";
	}

	// Perro perro2 = new Perro("Toby");
	public Perro(String nombre){
		this.nombre = nombre;
		this.estado = "";
	}

	//Perro perro3 = new Perro("Max", "Durmiendo!");
	public Perro (String nombre, String estado){
		this.nombre = nombre;
		this.estado = estado;
	}

	// Metodos
	// Son acciones (verbos)
	// Declarar accesibilidad -> public,  private (si se puede acceder desde la instancia)
	// Tipo de retorno (el valor que queremos devolver luego del procesamiento)
	// Nombre del metodo (en camelCase)
	// Parametro (que necesita para poder funcionar)
	public void bautizar(String nombreDelPerro){
		nombre = nombreDelPerro;
	}

	public String saludar(){
		String datos = "Guau! Me llamo " + nombre  + " y estoy " + estado;
		return datos;
	}
	// Comentario que agregué en Sublime
	public void correr (){

		String estado ="corriendo!\n" 
		+ "              .--~~,__\n"+ 
	    " :-....,-------`~~'._.'\n"+ 
	    "  `-,,,  ,_      ;'~U'\n"+ 
	    "   _,-' ,'`-__; '--.\n"+ 
	    "  (_/'~~      ''''(;\n";
	    this.estado = estado;
	} 

	public void sentarse(){
		String sentado ="Sentado!\n" + "                                           /\\ /\\\n";
      	sentado += "                                          /  \\---._\n";
      	sentado += "                                         / / `     `\\\n";
      	sentado += "                                         \\ \\   `'<@)@)      \n";
      	sentado += "                                         /`         ~ ~._ \n";
      	sentado += "                                        /                `() \n";
      	sentado += "                                       /    \\   (` ,_.:.  /\n";
      	sentado += "                                      / ~    `\\   (vVvvvvV\n";
      	sentado += "                                     /       |`\\_ `^^^/\n";
      	sentado += "                                 ___/________|_  `---'\n";
      	sentado += "                                (______________) _\n";
      	sentado += "                                _/~          | `(_)\n";
      	sentado += "                              _/~             \\  \n";
      	sentado += "                            _/~               |\n";
      	sentado += "                          _/~                 |\n";
      	sentado += "                        _/~                   |\n";
      	sentado += "                      _/~         ~.          |\n";
      	sentado += "                    _/~             \\        /\\\n";
      	sentado += "                 __/~               /`\\     `||\n";
      	sentado += "               _/~      ~~-._     /~   \\     ||\n";
      	sentado += "              /~             ~./~'      \\    |)\n";
      	sentado += "             /                 ~.        \\   )|\n";
      	sentado += "            /                    :       |   ||\n";
      	sentado += "            |                    :       |   ||\n";
      	sentado += "            |                   .'       |   ||\n";
      	sentado += "       __.-`                __.'--.      |   |`---. \n";
      	sentado += "    .-~  ___.         __.--~`--.))))     |   `---.)))\n";
     	sentado += "   `---~~     `-...--.________)))))      \\_____)))))\n"; 
		this.estado = sentado;
	}

}
