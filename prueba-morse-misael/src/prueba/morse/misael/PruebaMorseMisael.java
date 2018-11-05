/**
 *Ejercicio 1. Elaborar un programa de Consola Java, que traduzca texto a código morse y viceversa,
Tomando en cuenta las siguientes consideraciones.
a) Cada letra (en morse) Será separada con un espacio
b)Cada palabra (en morse) será separada por tres espacios
**/
 package prueba.morse.misael;

import java.util.Scanner;

/**
 *8-oct-2018
 * @author Misael Baeza Padilla
 */
public class PruebaMorseMisael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Texto de bienvenida y solicitud al usuario
        System.out.println("Bienvenido, por favor selecciona la opcion que desees");
        System.out.println("Si deseas traducir de texto a morse escribe 1");
        System.out.println("Si deseas traducir de morse a texto escribe 2");
        
        Scanner leer = new Scanner(System.in);
        int Entrada = leer.nextInt();
        
        if( Entrada > 0 & Entrada < 2 ){
            System.out.println("Por favor introduzca el texto que desea traducir");
            Scanner texto = new Scanner (System.in);
            String teclado = texto.nextLine();
            //El siguiente string captura el texto introducido por el usuario
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
            String Salida = "";
            
            //La siguiente instrucción convierte las letras en mayúscula
             teclado = teclado.toUpperCase();
            
            //El arreglo contiene el equivalente de cada letra y numero en codigo
            String Arreglo[]= new String [36];
            
            Arreglo[0]=".-";        //A
            Arreglo[1]="-...";      //B
            Arreglo[2]="-.-.";      //C
            Arreglo[3]="-..";       //D
            Arreglo[4]=".";         //E
            Arreglo[5]="..-.";      //F
            Arreglo[6]="--.";       //G
            Arreglo[7]="....";      //H
            Arreglo[8]="..";        //I
            Arreglo[9]=".---";      //J
            Arreglo[10]="-.-";      //K
            Arreglo[11]=".-..";     //L
            Arreglo[12]="--";       //M
            Arreglo[13]="-.";       //N
            Arreglo[14]="---";      //0
            Arreglo[15]=".--.";     //P
            Arreglo[16]="--.-";     //Q
            Arreglo[17]=".-.";      //R
            Arreglo[18]="...";      //S
            Arreglo[19]="-";        //T
            Arreglo[20]="..-";      //U
            Arreglo[21]="...-";     //V
            Arreglo[22]=".--";      //W
            Arreglo[23]="-..-";     //X
            Arreglo[24]="-.--";     //Y
            Arreglo[25]="--..";     //Z
            Arreglo[26]=".----";    //1
            Arreglo[27]="..---";    //2    
            Arreglo[28]="...--";    //3
            Arreglo[29]="....-";    //4
            Arreglo[30]=".....";    //5
            Arreglo[31]="-....";    //6
            Arreglo[32]="--...";    //7
            Arreglo[33]="---..";    //8
            Arreglo[34]="----.";    //9
            Arreglo[34]="-----";    //0
            Arreglo[35]=" ";        //espacio
            
            //
            for  (int i = 0; i < teclado.length() ; i++){ // recorre el string introducido por el usuario
		if (teclado.charAt(i)==' ') Salida = Salida+' ';
		 else {
		     for  (int j = 0; j < caracteres.length() ; j++) { //recorre las letras
			if (teclado.charAt(i) == caracteres.charAt(j)){  // compara la entrada con las letras
							Salida = Salida + Arreglo[j] + ' ';
                     }
		        } 
                      }
	}
          //  Salida = Salida.substring(1,Salida.length());
            System.out.println(Salida);
        }
        
        if( Entrada >1 & Entrada < 3 ){
         
           System.out.println("Por favor introduzca el codigo morse que sea traducir");
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
        Scanner texto = new Scanner (System.in);
            String morse = texto.nextLine();
            String Salida2 = "";
           
            String Arreglo[]= new String [36];
            
            Arreglo[0]=".-";        //A
            Arreglo[1]="-...";      //B
            Arreglo[2]="-.-.";      //C
            Arreglo[3]="-..";       //D
            Arreglo[4]=".";         //E
            Arreglo[5]="..-.";      //F
            Arreglo[6]="--.";       //G
            Arreglo[7]="....";      //H
            Arreglo[8]="..";        //I
            Arreglo[9]=".---";      //J
            Arreglo[10]="-.-";      //K
            Arreglo[11]=".-..";     //L
            Arreglo[12]="--";       //M
            Arreglo[13]="-.";       //N
            Arreglo[14]="---";      //0
            Arreglo[15]=".--.";     //P
            Arreglo[16]="--.-";     //Q
            Arreglo[17]=".-.";      //R
            Arreglo[18]="...";      //S
            Arreglo[19]="-";        //T
            Arreglo[20]="..-";      //U
            Arreglo[21]="...-";     //V
            Arreglo[22]=".--";      //W
            Arreglo[23]="-..-";     //X
            Arreglo[24]="-.--";     //Y
            Arreglo[25]="--..";     //Z
            Arreglo[26]=".----";    //1
            Arreglo[27]="..---";    //2    
            Arreglo[28]="...--";    //3
            Arreglo[29]="....-";    //4
            Arreglo[30]=".....";    //5
            Arreglo[31]="-....";    //6
            Arreglo[32]="--...";    //7
            Arreglo[33]="---..";    //8
            Arreglo[34]="----.";    //9
            Arreglo[34]="-----";    //0
            Arreglo[35]=" ";        //Espacio
            
   String traduccion[] = morse.split(" ");
int tamaño = traduccion.length;
				
		    for  (int i = 0; i < tamaño; i++){
		      for (int j = 0; j < 36; j++)
		       if (traduccion[i].equals(Arreglo[j])) {
		       	Salida2 = Salida2 + caracteres.charAt(j);
		       	break;
		        		}
		        }
        Salida2 = Salida2.toUpperCase();
        System.out.println(Salida2);
    }
    }   
}
