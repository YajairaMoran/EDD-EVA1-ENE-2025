/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_ejercicios_basicos_9_18_ejericio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_EJERCICIOS_BASICOS_9_18_EJERICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System. in);
        System.out.println("9- NUMERO INICIAL Y FINAL");
        System.out.println("Introduce el número que va a iniciar la cadena");
        int resp1= captu.nextInt();
        System.out.println("Introduce el número que va a finalizar la cadena");
        int resp2= captu.nextInt();
        
        for (int i = resp1; i <= resp2; i++) {
             System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("****************************************************");
        System.out.println("10- NUMEROS PAR DEL ANTERIOR");
            for (int i = resp1; i <= resp2; i++) {
             int resi = i % 2;
                if (resi == 0)
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("****************************************************");
        System.out.println("11- TABLA DE MULTIPLICAR");
        System.out.println("De que número quieres la tabla de multiplicar");
        int resp3= captu.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resu=resp3*i;
            System.out.println(resp3+" x "+i+" = "+resu);
        }
        System.out.println("****************************************************");
        System.out.println("12- SUMA DE LOS 100 NUMERO NATURALES");
        int numNat=100;
        int suma=0;
        for (int i = 0; i<= numNat; i++) {
             suma = suma+i;
        }
        System.out.println("La suma total de 100 es: "+suma);
        System.out.println("****************************************************");
        System.out.println("13- FACTORIAL DE UN NUMERO");
        System.out.println("Ingresa un numero para calcular el factorial");
        int nFactorial = captu.nextInt();
        int suma2 = 1;
        for (int i = 1; i<= nFactorial; i++) {
            suma2 = suma2 * i;
        }
        System.out.println("El factorial de "+nFactorial+" es: "+suma2);
        System.out.println("****************************************************");
        System.out.println("14- SERIE FIBONACCI");
		int sig = 1;
                int act = 0;
                int temp = 0;
		for (int i = 1; i <= 10; i++) {
                    temp = act;
                    act = sig;
                    sig = sig + temp;
                    System.out.print(act+" "); 
		}
        System.out.println("");
	System.out.println("****************************************************");
        System.out.println("15- NUMEROS PRIMOS EN 100");	
        int canti = 100;
//        int divi;
//        for (int i = 2; i < canti; i++) {
////             int resu = canti/i;
//             int resp =canti%i;
//            if (resp==1) {
//            System.out.print(resp + " ");
//            }
            for (int i = 2; i <= canti; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i; j++) { 
                int resu=i % j;
                if (resu == 0) {
                    esPrimo = false; 
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        System.out.println("****************************************************");
        System.out.println("16- INVERTIR UNA CADENA");
        
        System.out.println("Introduce el texto que quieres invertir");
        String resp=captu.next();
        String resultado2="";
        for (int i =resp.length()-1 ; i >= 0; i--) {
            resultado2 += resp.charAt(i);
        }
        System.out.println("El texto invertido es: "+resultado2);
        System.out.println("****************************************************");
        System.out.println("17- TRIANGULO DE *");
        System.out.println("Introduce un numero");
        int num = captu.nextInt();
        for (int  i = 1;  i <= num; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("****************************************************");
        System.out.println("18- N NUMEROS DE LA SERIE FIBONACCI");
        System.out.println("Introduce los numeros que quieres que tenga la serie");
        int resp18 = captu.nextInt();
		int sig2 = 1;
                int act2 = 0;
                int temp2 = 0;
		for (int i = 1; i <= resp18; i++) {
                    temp2 = act2;
                    act2 = sig2;
                    sig2 = sig2 + temp2;
                    System.out.print(act2+" "); 
		}
            
        
        }     
        
    }
    

