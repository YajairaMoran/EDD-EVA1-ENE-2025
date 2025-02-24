/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_22_FIBONACCI {

    public static void main(String[] args) {
        Scanner captu=new Scanner(System.in);
        System.out.println("Cual número quieres que imprima de la serie Fibonacci: ");
        int resp=captu.nextInt();
        int resu =fibonacci(resp);
        System.out.println(resu);
        
    }
    public static int fibonacci(int num1){
        if (num1 <= 2) {
            return num1;
        }
//        int num2 = 1;  // Primer número de la serie Fibonacci
//        int num3 = 1;  // Segundo número de la serie Fibonacci
//        for (int i = 2; i <= num1; i++) {
//            int temp = num2;
//            num2 += num3;
//            num3 = temp;
//        }
//        return num2;
        return fibonacci(num1 - 1) + fibonacci(num1 - 2);
    }
    
}
