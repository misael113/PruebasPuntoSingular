
package prueba.herencia.misael2;

/**
 *15-oct-2018
 * @author Misael Baeza Padilla
 */
public class Cuadrado {

    public double numero;

    public  Cuadrado(double lado) {
        this.numero =  lado;
    }


    public  double calculoarea(){
        return Math.sqrt(this.numero);
    }

    public  double calculoperimetro()
    {
        return this.numero *4;
    }
}
