/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_factorial;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calcular el factorial 5x4x3x2x1=120
        Scanner captu = new Scanner (System. in);
        System.out.println("Ingresa un numero para calcular el factorial");
        int numero = captu.nextInt();
        int suma = 1;

        for (int i = 1; i<= numero; i++) {
            suma = suma * i;
        }
        System.out.println(suma);
        

    }
    
}
