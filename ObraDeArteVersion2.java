import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArteVersion2 {
  
  private static final int ANCHO = 600;
  private static final int ALTO = 600;
  private static final int MIN = 0;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 5;
  
  private int[][] dibujo = null;
  
  JFrame f = null;
  
  private BufferedImage imagen = null;
  
  public ObraDeArteVersion2(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    dibujo = new int[ANCHO][ALTO];
    getDibujo();
    dibujarLinea(100,220, 100,120);
    dibujarLinea(200,220,200,320);
    dibujarLinea(300,320,300,320);
    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        switch (dibujo[i][j]) {
          case 0:
            imagen.setRGB(i, j, Color.WHITE.getRGB());
            break;
          case 1:
            imagen.setRGB(i, j, Color.BLACK.getRGB());
            break;
          case 2:
            imagen.setRGB(i, j, Color.RED.getRGB());
            break;
          case 3:
            imagen.setRGB(i, j, Color.BLUE.getRGB());
            break;
          case 4:
            imagen.setRGB(i, j, Color.YELLOW.getRGB());
            break;      
          default:
            RGB anaranjado = new RGB(235,186,52);
            imagen.setRGB(i, j, /*Color.GREEN.getRGB()*/ anaranjado.calcularValorFuncional());
        } //switch
      } //for
    } //for
    
    f = new JFrame("Mi obra de arte"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
    
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f.repaint();
    f.setVisible(true);
  }// constructor
  
  public void getDibujo(){
    //dibujo = new int[ANCHO][ALTO];
    int aleatorio = 0;
    for(int i=0;i<ANCHO;i+=SUBMATRIZ){
      for(int j=0;j<ALTO;j+=SUBMATRIZ){
        aleatorio = MIN + (int)(Math.random() * (MAX - MIN));
        for (int k = 0; k < SUBMATRIZ; k++) {
          for (int m = 0; m < SUBMATRIZ; m++) {
            dibujo[k+i][m+j] = aleatorio; 
          }
        }
      } //for 
    }
  } 


  public void dibujarLinea(int desdeX, int hastaX, int desdeY, int hastaY){
    for(int i = desdeX; i< hastaX; i++){
      for(int j = desdeY; j < hastaY; j++){
        dibujo[i][j] = 1;
      }      
    }

  }

  public static void main(String[] args){
    ObraDeArteVersion2 o = new ObraDeArteVersion2();
  }
}

