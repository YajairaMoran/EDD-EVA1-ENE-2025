/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_arreglos_multiples;

/**
 *
 * @author usuario
 */
public class EVA1_16_ARREGLOS_MULTIPLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][]=new int[5][];
        matriz[0]= new int [6];//especifica el numero de columnas que tiene el segundo corchete ya que este no esta especificado
        matriz[1]= new int [2];
        matriz[2]= new int [4];
        matriz[3]= new int [7];
        matriz[4]= new int [1];
        //ciclo
        for (int i = 0; i < matriz.length; i++) {//controla el primer par de corchetes y regresa 5--controla las filas
            for (int j = 0; j < matriz[i].length; j++) {//controla el segundo par de corchetes y regresa
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {//controla el primer par de corchetes y regresa 5--controla las filas
            for (int j = 0; j < matriz[i].length; j++) {//controla el segundo par de corchetes y regresa
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz);
        System.out.println(matriz[0]);
        
        
    }
    
}
