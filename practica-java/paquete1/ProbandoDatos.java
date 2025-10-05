package paquete1;


/**
 * @author NachoElVicho
 * @version 1.0
 */
public class ProbandoDatos{
    
    //estos son mis atributos de pruebas de mi clase
    
    int entero;
    char caracter;
    double doble;
    float flotante;
    byte myByte;
    short myShort;
    
    //este es el constructor de la clase, si no se especifica el constructor por defecto siempre esta
    
    public ProbandoDatos(int ent, char carac, double dobl, float flot, byte by, short shor){
        this.entero=ent; this.caracter=carac; this.doble=(double) dobl; this.flotante=(float) flot;
        this.myByte=(byte) by;
        this.myShort=(short) shor;
    }
    
    public void getDatos(){
        System.out.println("tu entero es: " + this.entero);
        System.out.println("tu char es: " + this.caracter);
        System.out.println("tu doble es: " + this.doble);
        System.out.println("tu flotante es: " + this.flotante);
        System.out.println("tu byte es: " + this.myByte);
        System.out.println("tu short es: " + this.myShort);
    }
    
    public int potenciarEntero(int potencia){
        int aux=1;
        for(int i=0;i<potencia;i++){
            aux=aux*this.entero;
            System.out.println("entero actual: " + aux + " iteracion numero: " + (i+1));
        }
        
     return aux;   
    }
    //estos son los metododos de la clase
}