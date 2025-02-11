/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_real;

/**
 *
 * @author usuario
 */
public class EVA1_12_COPIA_REAL {

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
        int[] copia = new int[10];//crea un nuevo arreglo con nueva direccion
        System.out.println(copia);//imprime la nueva direccion
        //imprime la informacion del arreglo primcipal en el nuevo
        for (int i = 0; i < copia.length; i++) {
            copia[i] =datos[i];   
        }
        for (int valor: copia) {
            System.out.print("["+ valor +"]");//imprime los valores del arreglo que tiene los mismod valores del primer arreglo
        }
        
        
        
    }
    
}
