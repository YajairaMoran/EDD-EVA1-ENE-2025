/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_for_each;

/**
 *
 * @author usuario
 */
public class EVA1_9_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[]= new int [10];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] =(int)(Math.random()*100);   
        }
        for (int valor: datos) {
            System.out.print("["+ valor +"]");
        }
        
        
    }
    
}
