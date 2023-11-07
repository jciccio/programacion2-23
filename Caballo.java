public class Caballo{
	
	private int [][] tablero;

	public Caballo(){
		tablero = new int [8][8];
	}


	public boolean realizarMovimento(int contador, int fila,int columna){
		boolean comparacion = false;
	    if(contador>63){
	    	comparacion = true;
	    	tablero[fila][columna]=contador;
	    }
	    else{   
	        tablero[fila][columna]=contador;   
	        int [] vF ={-1,-2,-2,-1,1,2,2,1};
	        int [] vC ={2,1,-1,-2,-2,-1,1,2};
	        for(int i=0;i<8 && !comparacion;i++){       
	            if(fila+vF[i]>=0 && fila+vF[i]<8 && columna+vC[i]>=0 && columna+vC[i]<8){       
	                if(tablero[fila+vF[i]][columna+vC[i]]==0){        
	                   comparacion = realizarMovimento(contador+1,fila+vF[i],columna+vC[i]);   
	                }    
	            }     
	    	}
			if(!comparacion){
				tablero[fila][columna]=0;
			}
		}
	    return comparacion;
	}

	public void imprimirMatriz(){
		for(int i=0;i<tablero.length;i++){
			for(int s=0;s<tablero[0].length;s++){
				System.out.print(tablero[i][s]+"\t");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Caballo prueba1=new Caballo();
		prueba1.realizarMovimento(1,5,5);
		prueba1.imprimirMatriz();
	}

}