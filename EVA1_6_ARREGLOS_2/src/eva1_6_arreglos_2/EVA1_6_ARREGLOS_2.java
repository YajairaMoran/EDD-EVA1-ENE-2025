/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglos_2;

/**
 *
 * @author usuario
 */
public class EVA1_6_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos []= new int [10];// new representa un nuevo objeto
        System.out.println(datos);//arreglo de enteros que esta en la direccion que imprime el programa
        System.out.println(datos.length);//length->lee la cantidad de elementos que tiene el arreglo
        //llenar el arreglo de valores aleatorios
        for (int i = 0; i < datos.length; i++) {
                     //casting
            datos[i] =(int)(Math.random()*100);   
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[ "+datos[i]+" ]");  
        }
        System.out.println("");
        System.out.println(datos [5]);
    }
    
}
