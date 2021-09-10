
package imc;

/**
 *
 * @author david
 */
public class Operacion {
    public double CalculoIMC(double peso, double altura){
        double imc=0;
        imc = peso/(altura * altura);
        
        
        
        return imc;
    }
}
