/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_copia_distintos;

/**
 *
 * @author usuario
 */
public class EVA1_13_COPIA_DISTINTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[]= new int [20];//arreglo principal
            System.out.println(datos);//Imprime la direccion del arreglo principal
            for (int i = 0; i < datos.length; i++) {//crea los datos del arreglo p
                datos[i] =(int)(Math.random()*100);   
            }
            for (int valor: datos) {//imprime los datos del arreglo p
                System.out.print("["+ valor +"]");
            }
        
            System.out.println("");
            System.out.println("Datos de la copia:");
        int[] copia = new int[10];//crea un nuevo arreglo copia
            System.out.println(copia);//imprime la direccion de copia
            for (int i = 0; i < copia.length; i++) {//manda a llamar los datos del arreglo 
                copia[i] =datos[i];   
            }
            for (int valor: copia) {
                System.out.print("["+ valor +"]");//imprime los valores del arreglo que tiene los mismod valores del primer arreglo
            }
    }
    
}
