public class Persona{

   // Atributos

   // Para definir un tipo de dato:
   // Declaramos el valor privado
   // Definimos qué tipo de dato es
   // Damos un nombre a la variable
   protected String nombre;

   public Persona (String nombre){
      this.nombre = nombre;
   }

   // Métodos
   // Acciones o métodos:
   // método publico o privado
   // lo que esperamos que retorne el método
   // El nombre del método
   // Los parámetros (lo que necesitamos recibir para que el método funcione)
   public void setNombre(String nombreParametro){
      this.nombre = nombreParametro; // esta línea asigna el atributo nombre
   }

   // invocacion de un método:
   // instancia.nombreMetodo()
   public void saludar()
   {
      System.out.println("Hola me llamo " + this.nombre);
   }
   /*    Esto es un comentario
      de varias líneas
   */

   public String toString(){
      return "Hola me llamo " + this.nombre;
   }

}