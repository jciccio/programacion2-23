import javax.swing.JOptionPane;

public class Interfaz{
	
	public int solicitarNumeroEntero(String mensaje){
		String numeroString = JOptionPane.showInputDialog(mensaje);	
		int numero = 0;
		try{
			// El codigo propenso a fallos
			numero = Integer.parseInt(numeroString);

		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el valor digitado a un número " + e);
		}
		return numero;
	}

	public double solicitarNumeroReal(String mensaje){
		String numeroString = JOptionPane.showInputDialog(mensaje);	
		double numero = 0;
		try{
			// El codigo propenso a fallos
			numero = Double.parseDouble(numeroString);

		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el valor digitado a un número " + e);
		}
		return numero;
	}

	public String solicitarHilera(String mensaje){
		return JOptionPane.showInputDialog(mensaje);	
	}

	public void mostrarDatos(String datos, String titulo){
		JOptionPane.showMessageDialog(null, datos, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}