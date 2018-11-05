
package prueba.herencia.misael2;
 import java.util.Scanner;
import java.lang.Math;
/**
 *12-oct-2018
 * @author Misael Baeza
 */
public class PruebaHerenciaMisael2 {

    static Cubo figura;
    static double resultado;
    
    public static void main(String[] args)
            
    {
        Scanner scanner = new Scanner(System.in);
        lectura ();
        opciones ();
        scanner.nextLine();
    }

       static void opciones(){

        int  entrada =menu_opciones();
        if(entrada != 5 || entrada > 6){
            System.out.println("opcion incorrecta");
        }
        while(entrada != 5 || entrada > 6)
        {
            resultado =seleccion(entrada ,figura);

            System.out.println("Resultado: " + resultado );

            entrada = menu_opciones ();
          
        }
        lectura ();
        opciones ();
    }

    static void lectura(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado:\t");
        
            double lado  = Double.parseDouble( scanner.nextLine());
            figura = new Cubo(lado);
        
    }

    static double seleccion( int entrada, Cubo cubo){

        double resultado = 0;
        switch (entrada){
            case 1: resultado =cubo.calculoperimetro(true); break;
            case 2: resultado = cubo.calculoperimetro (); break;
            case 3: resultado = cubo.calculoperimetro(); break;
            case 4: resultado = cubo.calculoperimetro(false); break;
            case 5: lectura();break;
            case 6: System.exit (0);break;

        }
        return resultado;
    }
      static int menu_opciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Seleccione una de las siguientes opciones\n");
        System.out.print ("1: Perímetro cuadrado\n");
        System.out.print ("2: calcular área\n");
        System.out.print ("3: calcular Volúmen\n");
        System.out.print ("4: calcular Perímetro cubo\n");
        System.out.print ("5: Reiniciar el menu \n");
        System.out.print ("6: Salir\n");

        int entrada  = Integer.parseInt( scanner.nextLine());
        return entrada;
    }
}
    

