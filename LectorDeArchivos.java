import java.io.*;
public class LectorDeArchivos{
	//Abrir
	// Cerrar
	// Leer (una linea o un archivo completo)

	private BufferedReader lector;
	private boolean estaAbierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			estaAbierto = true;
		}
		catch(IOException e){
			estaAbierto = false;
			System.err.println("Ocurrio un error al leer el archivo " + ruta + " " + e);
		}
	}

	public void cerrar(){
		try{
			lector.close();
			estaAbierto = false;
		}
		catch(IOException e){
			System.err.println("Ocurrio un error al cerrar el archivo " + e);
		}
	}

	public String leerLinea(){
		String linea = null;
		if(estaAbierto){
			try{
				linea = lector.readLine(); 
			}
			catch(IOException e){
				estaAbierto = false;
				System.err.println("Ocurrio un error al leer la línea del archivo " + e);
			}
		}
		return linea;
	}

	public String leerArchivo(){
		String contenido = "";
		if(estaAbierto){
			String linea = "";
			while((linea = leerLinea()) != null){
				contenido += linea;
				contenido += "\r\n";
			}
		}
		return contenido;
	}


	public static void main (String [] args){
		LectorDeArchivos lector = new LectorDeArchivos("LectorDeArchivos.java");
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());

		lector.cerrar();

		lector = new LectorDeArchivos("rankings/archivo.csv");
		System.out.print(lector.leerArchivo());
		lector.cerrar();
	}



}