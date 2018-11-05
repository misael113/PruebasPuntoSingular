/*
 * Elabora un programa de consola java que convierta un numero entero en un rango
de 1 a 1000 introducido por el usuario a su representacion numerica romana.
 */
package prueba.romanos.misael;

import java.util.Scanner;

/**
 *10-oct-2018
 * @author Misael Baeza
 */
public class PruebaRomanosMisael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int numeroEntero=0;
        System.out.println("Por favor introduzca el numero entero que desea convertir a romanos");
        
        Scanner lectura = new Scanner(System.in);
      int numeroEntero = lectura.nextInt();
      
      if (numeroEntero <= 0 || numeroEntero > 1000){
          System.out.println("El cero y los numeros negativos son incompatibles");
          System.out.println("El programa solo convierte numeros entre 1-1000");
      } 
      
      else {
      do {
        
      } while (numeroEntero < 1 || numeroEntero > 1000);
      String resultado = conversion(numeroEntero);
      System.out.println(resultado);
    }
    }
    
  public static String conversion(int numeroEntero) {
      int  millares, centenas, decenas, unidades;
      String NumeroRomano = "";
     
      millares = numeroEntero / 1000;
      centenas = numeroEntero / 100 % 10;
      decenas = numeroEntero / 10 % 10;
      unidades = numeroEntero % 10;

     
      for ( int i = 1; i <= millares; i++) {
             NumeroRomano = NumeroRomano+ "M";
      }

     
      if (centenas == 9) {
          NumeroRomano = NumeroRomano + "CM";
      } else if (centenas >= 5) {
                     NumeroRomano = NumeroRomano + "D";
                     for ( int i = 6; i <= centenas; i++) {
                            NumeroRomano = NumeroRomano + "C";
                     }
      } else if (centenas == 4) {
                      NumeroRomano = NumeroRomano + "CD";
      } else {
                  for ( int i = 1; i <= centenas; i++) {
                         NumeroRomano = NumeroRomano + "C";
                  }
      }

     
      if (decenas == 9) {
           NumeroRomano= NumeroRomano + "XC";
      } else if (decenas >= 5) {
                      NumeroRomano= NumeroRomano + "L";
                      for (int i = 6; i <= decenas; i++) {
                           NumeroRomano = NumeroRomano + "X";
                      }
      } else if (decenas == 4) {
                      NumeroRomano =NumeroRomano + "XL";
      } else {
                    for (int i = 1; i <= decenas; i++) {
                          NumeroRomano = NumeroRomano + "X";
                    }
      }

     
      if (unidades == 9) {
           NumeroRomano = NumeroRomano + "IX";
      } else if (unidades >= 5) {
                      NumeroRomano = NumeroRomano + "V";
                      for (int i = 6; i <= unidades; i++) {
                             NumeroRomano =NumeroRomano + "I";
                      }
      } else if (unidades == 4) {
                      NumeroRomano=NumeroRomano + "IV";
      } else {
                  for (int i = 1; i <= unidades; i++) {
                         NumeroRomano = NumeroRomano + "I";
                  }
      }
      return NumeroRomano;
  }
    
}
