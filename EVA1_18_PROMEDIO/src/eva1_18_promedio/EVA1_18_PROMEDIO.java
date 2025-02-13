/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_promedio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_18_PROMEDIO {

//public class Main {
    public static void main(String[] args) {
        int sGlobal = 0;  //acumula la suma de todas las calificaciones
        int tCalifGlobal = 0; //cuenta todas las calificaciones
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de grupos: ");
        int cGrupos = captu.nextInt();
        
        int [][][] lista = new int[cGrupos][][];//el primer corchete es la cantidad de grupos

        for (int i = 0; i < cGrupos; i++) {//el primer for captura la cantidad de alumnos por grupo
            System.err.println("Cantidad de alumnos en el grupo " + (i+1) + ":");
            int cAlumnos = captu.nextInt();
            lista[i] = new int[cAlumnos][];//el segundo corchete es la cantidad de alumnos en cada grupo
            for (int j = 0; j < cAlumnos; j++) { //el segundo for captura una calificación por alumno
                System.out.println("Ingresa la calificación del alumno " + (j + 1) + " del grupo " + (i + 1) + ":");
                lista[i][j] = new int[1]; //solo se registra una calificación por alumno
                lista[i][j][0] = captu.nextInt(); //se captura la calificación de cada alumno
//                lista[i][j] = new int[calif];
//                  int calif = captu.nextInt();   
                sGlobal += lista[i][j][0]; //suma de la calificación global
                tCalifGlobal++;
            }
        }
        //muestra las calificaciones registradas en cada grupo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("calificaciones del grupo " + (i + 1) + ":");
            for (int j = 0; j < lista[i].length; j++) {
                for (int k = 0; k < lista[i][j].length; k++) {
                    System.out.print("["+lista[i][j][k] + "]");
                } 
//                System.out.println("");
            }
            System.out.println();
        }
        
        //muestra el promedio de cada grupo
        for (int i = 0; i < lista.length; i++) {//calcula y muestra el promedio de calificaciones por grupo
            int suma = 0;
            int totalCalif = 0;
            for (int j = 0; j < lista[i].length; j++) {//suma todas las calificaciones del grupo
                suma += lista[i][j][0]; //suma la calificación de cada alumno
                totalCalif++; //cuenta cada calificación
            }
                double prom= (double) suma / totalCalif; // Calcular el promedio
                System.out.println("El promedio de calificaciones del grupo " + (i + 1) + " es: " + prom);
            }
        //se calcula el promedio global
         double pGlobal = (double) sGlobal / tCalifGlobal; 
         System.out.println("El promedio global de todas las calificaciones es: " + pGlobal);
        
        }
    }

