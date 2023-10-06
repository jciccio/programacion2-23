public class PilaDeFichas{
	private Ficha [] fichas;

	public PilaDeFichas(){
		fichas = new Ficha[28];
		int contador = 0;
		for(int i = 0 ; i < 7 ; i++){
			for(int j = 0 ; j<= i; j++){
				fichas[contador] = new Ficha(i,j);
				contador++;
			}
		}
	}

	public void revolver (){
		for(int i = 0 ; i < fichas.length ; i++){
			int numeroAleatorio = (int)(Math.random()*fichas.length);
			Ficha temporal = fichas[i];
			fichas[i] = fichas[numeroAleatorio];
			fichas[numeroAleatorio] = temporal;
		}
	}

	public Ficha getFicha(int indice){
		Ficha retorno = null;
		if(indice >= 0 && indice < fichas.length){
			retorno = fichas[indice];
		}
		return retorno;
	}
}