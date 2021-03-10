/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedato_67606;

/**
 *
 * @author Campe
 */
public class TipodeDato_67606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valormaximo = Integer.MAX_VALUE;    //VALOR MAXIMO
        int valorminimo = Integer.MIN_VALUE;     //VALOR MINIMO
        System.out.println ("IntMAX:" + valormaximo);
        System.out.println ("IntMIN:" + valorminimo);
    
        byte valorMaximo = Byte.MAX_VALUE;            //VALOR MAXIMO
        byte valorMinimo = Byte.MIN_VALUE;           //VALOR MINIMO
        System.out.println("byteMAX:" + valorMaximo);
        System.out.println("byteMIN:" + valorMinimo);
       
        short numero = Short.MAX_VALUE;              //VALOR MAXIMO
        short numero1 = Short.MIN_VALUE;            //VALOR MINIMO
        System.out.println("shortMAX: " + numero);
        System.out.println("shortMIN: " + numero1);
        
        long valor = Long.MAX_VALUE;              //VALOR MAXIMO
        long valor2 = Long.MIN_VALUE;              //VALOR MINIMO
        System.out.println("longMAX: " + valor);
        System.out.println("longMIN: " + valor2);
        
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;
        System.out.println("doubleMAX= " + max);
        System.out.println("doubleMIN= " + min);
    }
    
}
