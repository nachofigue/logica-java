 
import paquete1.ProbandoDatos;
public class Main{

    public static void main(String [] args){
        ProbandoDatos obj1=new ProbandoDatos(5, 'a', 123123123, (float)12.2134, (byte)50, (short)130);
        
        obj1.getDatos();
        obj1.potenciarEntero(5);
    }
}
