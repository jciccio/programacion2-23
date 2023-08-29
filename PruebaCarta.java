public class PruebaCarta{
	
	public static void main (String [] args){
		// pida al usuario el numero y el palo
		// 2 variables

		Carta carta1 = new Carta();
		System.out.println("La carta1 es: " + carta1.getNumero() + " de " + carta1.getPalo());

		carta1.setNumero(4);
		carta1.setPalo("Treboles");
		System.out.println("La carta1 es: " + carta1.getNumero() + " de " + carta1.getPalo());

		Carta carta2 = new Carta(9);
		System.out.println("La carta es: " + carta2.getNumero() + " de " + carta2.getPalo());

		Carta carta3 = new Carta(2,"Espadas");
		System.out.println("La carta es: " + carta3.getNumero() + " de " + carta3.getPalo());

		System.out.println("La carta1 es: " + carta1.getNumero() + " de " + carta1.getPalo());


	}
}