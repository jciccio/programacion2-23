import javax.swing.*;
public class RGB{
 private int rojo;
 private int verde;
 private int azul;
 private String nombre;

 public RGB(int r, int g, int b){
    rojo = clamp(r);
    verde = clamp(g);
    azul = clamp(b);   
 }

 public int clamp(int valor){
  int resultado = 0;
  if (valor < 0){
   resultado = 0;
  }
  else if (valor > 255){
   resultado = 255;
  }
  else{
   resultado = valor;
  }
  return resultado;
 }

 public void setRojo(int valorRojo){
  this.rojo = clamp(valorRojo);
 }

 public void setVerde(int valorVerde){
  this.verde = clamp(valorVerde);
 }

 public void setAzul (int valor){
  this.azul = clamp(valor);
 }

 public int getRojo(){
  return rojo;
 }

 public int calcularValorFuncional (){
  return rojo * 255 *255  + verde * 255 + azul;
 }


 public static void main (String []args){
  
 }

}