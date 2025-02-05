/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglote;

/**
 *
 * @author usuario
 */
public class EVA1_7_ARREGLOTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos []= new int [1000000000];// new representa un nuevo objeto
        for (int i = 0; i < datos.length; i++) {
                     //casting
            datos[i] =(int)(Math.random()*100);   
        }
//        for (int i = 0; i < datos.length; i++) {
//            System.out.print("[ "+datos[i]+" ]");  
//        }
    }
    
}
