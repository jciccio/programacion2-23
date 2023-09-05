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

		Carta carta4 = new Carta(13, "Espadas");
		System.out.println(carta4.getNumeroSwitch());

		Carta carta5 = new Carta(1, "Espadas");
		System.out.println(carta5.getNumeroSwitch());


		System.out.println(carta5.toString());

		Carta carta6 = new Carta(11, "Treboles");
		System.out.println(carta6);

	}
}