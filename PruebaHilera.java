public class PruebaHilera{
	public static void main (String args[]){
		StringBuilder hilera = new StringBuilder("????");
		System.out.println(hilera);
		hilera.replace(1,2,"A");// Desde inclusive, hasta no inclusive
		System.out.println(hilera);

		StringBuilder hilera2 = new StringBuilder();
		hilera2.append("H");
		System.out.println(hilera2);

		String acentos = "áéíóúáááááááÁÁÁ!!!".toLowerCase();

		System.out.println(acentos.replace('á', 'a'));

	}
}