import java.io.*;

public class EscritorDeArchivos{
	// C:\Users\Jose Antonio\Desktop\Progra 1 - II 2023\src
	// examen 1//HolaMundo.txt
	private BufferedWriter escritor;
	private boolean estaAbierto;

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal ){
		try{
			escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal));
			estaAbierto = true;
		}
		catch(IOException e){
			estaAbierto = false;
			System.err.println("Ocurrio un error al abrir el archivo " + ruta + " " + e);
		}
	}

	public void cerrar(){
		if(estaAbierto){
			try{
				this.escritor.close();
				estaAbierto = false;
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al cerrar el archivo " + e);
			}
		}
	}

	public boolean escribir(String datos){
		boolean escrito = false;
		if(estaAbierto){
			try{
				escritor.write(datos);
				escrito = true;
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al escribir en el archivo " + e);
				estaAbierto = false;
			}
		}
		return escrito;
	}

	public static void main (String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("Prueba23Octubre.txt", true);
		escritor.escribir("Hola  \n");
		escritor.escribir("a todos");
		escritor.cerrar();

		escritor = new EscritorDeArchivos("Recursividad.java", true);
		escritor.escribir("// Esto es un comentario hecho con nuestro escritor de archivos");
		escritor.cerrar();

		escritor = new EscritorDeArchivos("rankings/ArchivoSinExtension", true);
		escritor.escribir("Este es un archivo sin extensión");
		escritor.cerrar();

		escritor = new EscritorDeArchivos("rankings/archivo.csv", false);
		escritor.escribir("pais, ciudad, canton\n");
		escritor.escribir("Costa Rica, San Jose, San Pedro\n");
		escritor.escribir("Costa Rica, San Jose, Montes de Oca \n");
		escritor.escribir("Costa Rica, Limon, Matina\n");
		escritor.cerrar();
	}
}