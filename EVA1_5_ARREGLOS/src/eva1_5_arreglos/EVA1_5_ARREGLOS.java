/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_arreglos;

/**
 *
 * @author usuario
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] datos = new int [10];// es un objeto cuando tiene la palablra NEW
        //int [] a ,b ,c;-->tres arreglos tipo entero
        //int [] a ,b[],c ;-->un arreglo tipo entero
        //los arreglos son de tipo aleatorio(por indices)
        datos [0] = 100;
        datos [1] = 200;
        //datos [10]= 1000;-->genera una excepcion(llega hasta el 9)
        datos [9]= 1000;
        //uso de ciclos para manejar arreglos:
        for (int i = 0; i < 10; i++) {//asigmacion de datos
            datos [i]=100;
        }
        for (int i = 0; i < 10; i++) {//lectura de datos
            System.out.println("[ "+ datos[i]+" ]");
        }
        
    }
    
}
