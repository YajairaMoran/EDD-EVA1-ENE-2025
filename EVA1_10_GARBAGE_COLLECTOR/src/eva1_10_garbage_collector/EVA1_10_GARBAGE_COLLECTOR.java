/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_garbage_collector;

/**
 *
 * @author usuario
 */
public class EVA1_10_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[]= new int [10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] =(int)(Math.random()*100);   
        }
        for (int valor: datos) {
            System.out.print("["+ valor +"]");
        }
        
        System.out.println("");
        datos = new int[5];//se crea una nueva direccion ya que el tamaño del arreglo se cambio
        System.out.println(datos);
        for (int valor: datos) {
            System.out.print("["+ valor +"]");
        }
        
        
        
    }
    
}
