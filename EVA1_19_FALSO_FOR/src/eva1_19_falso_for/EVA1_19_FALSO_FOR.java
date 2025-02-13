/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_falso_for;

/**

 */
public class EVA1_19_FALSO_FOR {

    /**
     */
    public static void main(String[] args) {
        //imprimir una lista:5-4-3-2-1
        System.out.println("Ciclo for");
        for (int i = 5; i>= 1; i--) {
            System.out.print(i+" - ");
        }
        System.out.println("");
        System.out.println("Ciclo recursividad");
        //llamada recursiva
        listaNumerosRecu(5);
        
        
    }
    public static void listaNumerosRecu(int valor){
        //sodigo para resolver el problema
        System.out.print(valor+" - ");//imprime el resultado
        if (valor>1) {//controla la recursividad
        listaNumerosRecu(valor-1);//llamada recursiva//se vuelve a llamar al metodo con el valor anterior    
        }
        
    }
}
