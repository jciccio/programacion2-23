import javax.swing.JOptionPane;
public class PruebaInterfaz {
	
	public static void main(String [] args){
		

		String nombre = JOptionPane.showInputDialog("Digite su nombre");

		JOptionPane.showMessageDialog(null, "Hola " + nombre, "Mi Programa", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Hola " + nombre );


		String numeroString = JOptionPane.showInputDialog("Digite un número");	
		
		int numero = 0;
		try{
			// El codigo propenso a fallos
			numero = Integer.parseInt(numeroString);

		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el valor digitado a un número " + e);
			System.exit(1);
		}
		catch(Exception e){
			System.err.println("Ocurrio un error al convertir el valor digitado a un número " + e);
			System.exit(1);
		}



		System.out.println(numero + 1);
	}

}