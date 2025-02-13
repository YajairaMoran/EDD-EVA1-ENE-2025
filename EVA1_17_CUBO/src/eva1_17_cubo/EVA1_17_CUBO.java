/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_cubo;

/**
 *
 * @author usuario
 */
public class EVA1_17_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cubo [][][]= new int [5][3][4];
        for (int i = 0; i < cubo.length; i++) {//filas
            for (int j = 0; j < cubo[i].length; j++) {//columnas
                for (int k = 0; k < cubo[i][j].length; k++) {//profundidad
                    cubo[i][j][k]=(int)(Math.random()*100);
                }
            }
        }
        
        //imprime 5 matrices de 3 filas y 4 colunmas
        for (int i = 0; i < cubo.length; i++) {//filas
            for (int j = 0; j < cubo[i].length; j++) {//columnas
                for (int k = 0; k < cubo[i][j].length; k++) {//profundidad
                    System.out.print("["+cubo[i][j][k]+"]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        
    }
    
}
