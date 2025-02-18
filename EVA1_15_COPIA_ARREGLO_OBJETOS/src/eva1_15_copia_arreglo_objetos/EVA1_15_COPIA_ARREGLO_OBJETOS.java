/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_copia_arreglo_objetos;

/**
 *
 * @author usuario
 */
public class EVA1_15_COPIA_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona datos[]= new Persona [5];
        System.out.println("Direccion original: "+datos);//imprime la direccion del primer arreglo
        datos[0]= new Persona();
        datos[1]= new Persona();
        datos[2]= new Persona();
        datos[3]= new Persona();
        datos[4]= new Persona();
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]= new Persona();
        }
        datos[0].setNombre("Nombre 1");
        datos[1].setNombre("Nombre 2");
        datos[2].setNombre("Nombre 3");
        datos[3].setNombre("Nombre 4");
        datos[4].setNombre("Nombre 5");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i].getNombre());
        }
        
        System.out.println("");
        Persona copia[]= new Persona [5];

        System.out.println("Direccion copia: "+copia);//imprime la direccion del segundo arreglo
        for (int i = 0; i < copia.length; i++) {
            copia[i]= datos[i];
        }
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Copia: "+copia[i].getNombre());
        }
        System.out.println(datos[0]);
        System.out.println(copia[0]);
        
    }
}
class Persona{
         private String nombre;
    //metodos getters y setters
    //getters---->recupera un atributo/valores 
    //setters---->cambia el valor del atributo
    //this ----invoca a otro constructor
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}

/*
System.out.println(copia[0]);
        System.out.println(copia[1]);
        System.out.println(copia[2]);
        System.out.println(copia[3]);
        System.out.println(copia[4]);
System.out.println(datos[0]);
        System.out.println(datos[1]);
        System.out.println(datos[2]);
        System.out.println(datos[3]);
        System.out.println(datos[4]);
        copia[0]= new Persona();
        copia[1]= new Persona();
        copia[2]= new Persona();
        copia[3]= new Persona();
        copia[4]= new Persona();
        datos[0].setNombre("Nombre 1");
        datos[1].setNombre("Nombre 2");
        datos[2].setNombre("Nombre 3");
        datos[3].setNombre("Nombre 4");
        datos[4].setNombre("Nombre 5");
*/