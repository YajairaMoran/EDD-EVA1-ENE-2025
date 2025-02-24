/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_mcd;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_21_MCD {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System. in);
        System.out.println("Ingresa el primer numero");
        int nume1=captu.nextInt();
        System.out.println("Ingresa el segundo numero");
        int nume2=captu.nextInt();
//        int nume1=180;
//        int nume2=48;
        int mcd =maxComDiv(nume1, nume2);
        System.out.println("El maximo comun divisor es: "+mcd);
    }
    public static int maxComDiv(int num1,int num2){
        if (num2 == 0) {
            return num1; 
        }
      return maxComDiv(num2, num1 % num2);
    }
}
//while (num2 != 0){
//          int resu=num1%num2;
//            num1=num2;
//            num2=resu;
//        }