/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_ejercicios_basicos_1_5_ejericio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_EJERCICIOS_BASICOS_1_5_EJERICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("1- CALCULAR EL DESCUENTO");
        System.out.println("Ingresa el total de la compra");
        int total=captu.nextInt();
        int resu;
        if (total <100) {
            System.out.println("El total de tu compra es: "+total);
        }else if (total>100 && total<500) {
            resu=((total*90)/100);
            System.out.println("El total de tu compra es: "+resu);
        }else if (total>500) {
            resu=((total*80)/100);
            System.out.println("El total de tu compra es: "+resu);
        }
        
        System.out.println("****************************************************");
        System.out.println("2- CALCULAR CALIFICACION CON LETRAS");
        System.out.println("Introduce una calificacion");
        int calif = captu.nextInt();
        
        if (calif >= 90 && calif <= 100)
            System.out.println("Tu calificacion es A");
        else if (calif >= 80 && calif <= 89)
            System.out.println("Tu calificacion es B");
        else if (calif >= 70 && calif <= 79)
            System.out.println("Tu calificacion es C");
        else if (calif >= 60 && calif <= 69)
            System.out.println("Tu calificacion es D");
        else if (calif >= 0 && calif <= 59)
            System.out.println("Tu calificacion es F");
        else 
            System.out.println(calif + " no es una calificacion valida");
    
        System.out.println("****************************************************");
        System.out.println("3- DETERMINAR TIPO DE TRIANGULO");
        System.out.println("Ingresa la base del triangulo");
        int base=captu.nextInt();
        System.out.println("Ingresa el lado 1 del triangulo");
        int lado2=captu.nextInt();
        System.out.println("Ingresa el lado 2 del triangulo");
        int lado3=captu.nextInt();
        
        if (base==lado2 && lado2==lado3 && lado3==base )
            System.out.println("Es un triangulo equilatero");
        else if ((base==lado2 && lado2!=lado3 && lado3!=base)
                 ||(base!=lado2 && lado2==lado3 && lado3!=base)
                 ||(base!=lado2 && lado2!=lado3 && lado3==base))
            System.out.println("Es un triangulo isosceles");
        else if (base!=lado2 && lado2!=lado3 && lado3!=base)
            System.out.println("Es un triangulo escaleno");
        
        System.out.println("****************************************************");
        System.out.println("4- CLASIFICACION DE UNA PERSONA POR LA EDAD");
        System.out.println("Ingresa tu edad");
        int edad = captu.nextInt();
        
        if (edad >= 0 && edad <= 12)
            System.out.println("La edad es de un niño");
        else if (edad >= 13 && edad <= 17)
            System.out.println("La edad es de un adolecente");
        else if (edad >= 18 && edad <= 64)
            System.out.println("La edad es de un adulto");
        else if (edad >= 65 )
            System.out.println("La edad es de un adulto mayor");
        else 
            System.out.println(edad + " No es una edad valida");
        
        System.out.println("****************************************************");
        System.out.println("5- CALCULA TU INDICE DE MASA CORPORAL");
        System.out.println("Introduce tu peso en Kg");
        int peso = captu.nextInt();
        System.out.println("Introduce tu estatura en metros");
        double estatura = captu.nextDouble();
        
        double resu2=((peso)/(estatura*estatura));
        
        if (resu2 <=18.5) 
            System.out.println("Bajo de peso");
        else if (resu2 <=24.9) 
            System.out.println("Peso normal");
        
        else if (resu2 <=29.9) 
            System.out.println("Sobrepeso");
        
        else if (resu2 <=34.9) 
            System.out.println("Obesidad tipo 1");
        
        else if (resu2 <=39.9) 
            System.out.println("Obesidad tipo 2");
        
        else if (resu2 <40) 
            System.out.println("Obesidad tipo 3");
        
    }
    
}
