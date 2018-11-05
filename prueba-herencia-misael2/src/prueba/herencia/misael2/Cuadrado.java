
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


    public  double calculorarea(){
        return this.numero * this.numero;
    }

    public  double calculoperimetro()
    {
        return this.numero *4;
    }
}
