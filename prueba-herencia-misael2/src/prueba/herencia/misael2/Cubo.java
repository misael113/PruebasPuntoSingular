
package prueba.herencia.misael2;

/**
 *15-oct-2018
 * @author Misael Baeza
 */
import java.lang.Math;

public class Cubo extends Cuadrado
{

    public double numero;

    public Cubo(double lado) {
        super(lado);

        this.numero = lado;
    }


    public  double calculovolumen(){
        return Math.pow(this.numero,3);
    }


    public   double calculoperimetro(boolean verdad)
    {

        if (verdad){
           return super.calculoperimetro ();
        }
        else{
            return this.numero*12;
        }

    }
}

