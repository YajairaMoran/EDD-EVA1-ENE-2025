/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_ejercicios_basicos_6_8_ejericio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_EJERCICIOS_BASICOS_6_8_EJERICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System. in);
        System.out.println("6- INVERTIR CADENA DE TEXTO");
        System.out.println("Introduce el texto que quieres invertir");
        String resp= captu.nextLine();
        String resu2=cadInvertida(resp);
        System.out.println("El texto invertido es: "+resu2);
        
        System.out.println("****************************************************");
        System.out.println("7- NUMERO MAYOR");
        System.out.println("Introduce el primer numero");
        int resp1 = captu.nextInt();
        System.out.println("Introduce el segundo numero");
        int resp2 = captu.nextInt();
        int resu = numMayor( resp1, resp2);
        System.out.println("El número mayor es el: "+resu);
        
        System.out.println("****************************************************");
        System.out.println("8- REPETICIÓN DE CADENA");
        System.out.println("INGRESA EL TEXTO QUE QUIERES REPETIR");
        String cadena=captu.next();
        System.out.println("Cantidad de veces que se va a repetir el texto");
        int cantRepe = captu.nextInt();
        String repe= repeCadena(cadena,cantRepe);
        System.out.println(repe);
        
        
        
        
    }
    public static int numMayor(int num1,int num2){
//        int num1 = 0;
//        int num2 = 0;
        int resultado;
        if (num1>num2) {
             resultado = num1;
        } else {
             resultado = num2;
        }
        return resultado;
    }    
    
    public static String cadInvertida(String texto) {
        String resultado2="";
//        int resu2 = 0;
        for (int i =texto.length()-1 ; i >= 0; i--) {
            resultado2 += texto.charAt(i);
        }
      return resultado2; 
    }
    public static String repeCadena(String texto2,int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(texto2);
        }
        return null;
    }
    
    
}
