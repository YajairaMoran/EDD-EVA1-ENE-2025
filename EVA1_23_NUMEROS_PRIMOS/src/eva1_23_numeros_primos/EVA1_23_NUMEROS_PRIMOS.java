/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_numeros_primos;

/**
 *
 * @author usuario
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val=1554877;
        int repe=0;
        System.out.println("El " +val+ " es primo?? "+esPrimoineficiente(val));
//        System.out.println("Operaciones: " + repe);
        System.out.println("El " +val+ " es primo?? "+esPrimoEficiente(val));
//        System.out.println("Operaciones: " +esPrimoeficiente(repe) );
    }
    public static boolean esPrimoineficiente(int num1){
        boolean resu=true;
        int repe=0;
        for (int i = 2; i < num1; i++) {
            repe++;
            int residuo= num1%i;
            if (residuo==0) {//si la divicion es exacta ya no es primo
                resu=false;
                break;//ya no es necesario seguir buscando
            }
        }
       System.out.println("Las repeticiones del metodo ineficiente son: "+repe);
       return resu; 
    } 
    
    public static boolean esPrimoEficiente(int num2){
        boolean resu=true;
        int repe=0;
        int resu2 = (int) Math.sqrt(num2);
        for (int i = 2; i <= resu2; i++) {
            repe++;
            int residuo=  (num2%i);
            if (residuo==0) {//si la divicion es exacta ya no es primo
                resu=false;
                break;//ya no es necesario seguir buscando
            }
        }
       System.out.println("Las repeticiones del metodo eficiente son: "+repe);
       return resu; 
    } 
}
