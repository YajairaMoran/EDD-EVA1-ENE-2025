/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author usuario
 */
public class EVA1_3_HEAP {

    /**
    
     */
    public static void main(String[] args) {
        Prueba prueba= new Prueba();
        System.out.println(prueba.x);//prueba1
//        Prueba prueba2;//necesito un repaldo de prueba.x = 100
//        prueba2 = prueba;//no funciona, se duplica la misma direccion
        Prueba prueba2 = new Prueba();
        prueba2.x =prueba.x;
        
        System.out.println(prueba2.x);//prueba2
        prueba.x = 200;
        System.out.println(prueba.x);//valor de prueba 200
        System.out.println(prueba2.x);//valor de prueba 2 copia
        System.out.println(prueba);//direccion prueba 1
        System.out.println(prueba2);//direccion prueba 2
        
        if (prueba == prueba2)
            System.out.println("Objetos iguales");
        else 
            System.out.println("Objetos diferentes");
        
    }
    
}
class Prueba {
int x = 100;
}