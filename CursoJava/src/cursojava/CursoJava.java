// me indica el paquete (directorio) al cual corresponde la clase
// sirve para organizar las clases
package cursojava;
// public = visibilidad
//     me indica que es una clase

import java.util.ArrayList;
import java.util.Scanner;

//           nombre de la clase
//                me indica el comienzo de la clase
public class CursoJava {
    // Metodo principal
    // es publico la visibilidad
    //     no hace falta crear un objeto para ejecutar este metodo
    //            vacio = no retorna ningun valor este metodo
    //                 nombre del metodo
    //                     (parametros ...)
    //                                    me indica el comienzo del metodo
    public static void main(String[] args){
        // paquete
        //     paquete
        //         metodo para imprimir algo en la consola
        //                (parametros)   
        System.out.println("Hola Mundo");
        Cliente cliente1 = new Cliente();
        cliente1.setId_cliente(1);
        cliente1.setNombre_cliente("Juan");
        cliente1.setCredito_cliente(true);
        cliente1.setDescuento_cliente(15.5f);
        
        System.out.println(cliente1.getNombre_cliente());
        
        Cliente cliente2 = new Cliente(2, "Ana", false, 5.0f);
        
        System.out.println(cliente2.getNombre_cliente());
        
        // Tipos de datos 
        // primitivos
        // int
        int sueldo;
        sueldo = 1500000;
        // float         /casting
        float estatura = (float) 1.85;
        float peso = 45.75f;
        // boolean
        boolean estudia = false;
        // char
        char letra = 'a';
        // clases
        String nombre = "Juan";
        // Wrapper
        Integer recorrido = 125;
        Float medida = 458.45f;
        // Array
        Cliente[] clientes = new Cliente[10];
        clientes[0] = new Cliente(1, "juan", false, 1.5f);
        System.out.println(clientes[0].toString());
        int[][] tablero = new int[3][3];
        int[][][] dibujo = new int[3][3][3];
        // Colecciones
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.remove(0);
        System.out.println(nombres);
        
        ArrayList<Cliente> clientesTotales = new ArrayList<>();
        clientesTotales.add(new Cliente(1, "Juan", false, 1.75f));
        clientesTotales.add(new Cliente(2, "Ana", true, 1.85f));
        System.out.println(clientesTotales);
        // Estructura del lenguaje
        // Solicitar datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que edad tienes? ");
        int edad = scanner.nextInt();
        // If
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        // if anidado
        System.out.println("Que dia es? ");
        int dia = scanner.nextInt();
        if(dia == 1){
            System.out.println("Domingo");
        } else {
            if(dia == 2){
                System.out.println("Lunes");
            } else {
                if(dia == 3){
                    System.out.println("Martes");
                }
            }
        }
        // If else if
        if(dia == 1){
            System.out.println("Domingo");
        } else if(dia == 2){
            System.out.println("Lunes");
        } else if(dia == 3){
            System.out.println("Martes");
        }
        // Switch
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            default:
                break;
        }
        // Ciclos
        // For
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // While
        int contador = 1;
        while (contador <= 10) {
            System.out.println("While " + contador);
            contador++;
        }
        // Do while
        do {            
            System.out.println("Do while " + contador);
            contador++;
        } while (contador <= 10);
        // Each - Recorrer colecciones o arrays
        for (Cliente clienteTotal : clientesTotales) {
            System.out.println("id: " + clienteTotal.getId_cliente() +
                               ", nombre:" + clienteTotal.getNombre_cliente());
        }
        
        
    } // me indica el final del metodo
} // me indica el final de la clase