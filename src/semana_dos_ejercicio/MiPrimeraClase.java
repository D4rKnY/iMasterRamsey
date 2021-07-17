package semana_dos_ejercicio;

import java.util.*;
//package semana_dos_ejercicio;
// CLASE PRINCIPAL //
public class MiPrimeraClase { //esta es la clase principal donde defino los metodos que se van a usar abajo en el METODO principal 

    private static final Double PI = 3.1416;  //wrapper class 

    private MiPrimeraClase(String nombre){}

    public String metodoString(int n){//, String nombre, boolean EstadoCivil){ // el metodo string retorna una cadena y recibe como parametro un numero entero que se va a sumar con un valor intrducido por teclado
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese un numero para sumarle a cinco: ");
        int numero = sc.nextInt();
        sc.close();
        return "Metodo metodoString. \n El resultado es: "+ (n + numero);
    }

    public String metodoEntero(){
        int suma = 5+5;
        return "\nMetodo \"metodoEntero\" \n El resultado es: " + suma;
    }

    public int metodoEnteroDos(){
        int sumaDos=5+5;
        return sumaDos;
    }

    int MetodoEnteroTres(){
        int sumaDos=20+20;
        return sumaDos;
    }



// METODO principal//
    public static void main(String[] args){
        System.out.println("Hello World");

        MiPrimeraClase ejemplos = new MiPrimeraClase("Constructor\n");//cuando instancio la clase pal, le estoy diciendo a este metodo ppal (main) que tiene habilitado usar todos los metodos que yo defini alla arriba 

        System.out.println(ejemplos.metodoString(5));
        System.out.println(ejemplos.metodoEntero());

        System.out.println("\nMetodo \"metodoEnteroDos\"\n El resultado es: " + ejemplos.
        metodoEnteroDos());
        System.out.println("\nMetodo \"MetodoEnteroTres\"\n El resultado es: "+ ejemplos.
        MetodoEnteroTres());
        }
    }