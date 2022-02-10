package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Diego Romero
 * @company Ejercicio2
 * @Email 10778820@ieselgrao.org
 */
public class Ejercicio2 {

    static ArrayList<Integer> AL = new ArrayList();

    //metodo AGREGAR
    public static void agregar(int agregar) {
        AL.add(agregar);
    }

    //metodo BUSCAR
    public static void buscar(int buscar) {
        int pos = 0;
        for (int i = 0; AL.size() > i; i++) {
            pos = pos + i;
            if (AL.get(i) == buscar) {
                break;
            }
        }
        System.out.println("Se encuentra en la posición " + pos + "\n");
    }

    //metodo MODIFICAR
    public static void modificar(int mod) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        for (int i = 0; i < AL.size(); i++) {
            if (AL.get(i) == mod) {
                pos = i;
                break;
            }
        }
        System.out.println("Por que numero quieres sustituirlo?");
        int numero = sc.nextInt();
        AL.set(pos, numero);
    }

    //metodo ELIMINAR
    public static void eliminar(int eli) {
        for (int i = 0; i < AL.size(); i++) {
            if (AL.get(i) == eli) {
                AL.remove(i);
            }
            System.out.println("Eliminado+\n");
        }
    }

    //metodo INSERTAR EN POSICIÓN DADA
    public static void insertar(int pos, int elem) {
        AL.add(pos, elem);
    }

    //MOSTRAR ELEMENTOS
    public static void mostrar() {
        System.out.println(AL.toString() + "\n");
    }
    //Ordenar ASCENDENTEMENTE

    public static void ordenarA() {
        Comparator<Integer> comp = Collections.reverseOrder();
        Collections.sort(AL, comp);
        mostrar();
    }

    //Ordenar DESCENDENTEMENTE 5.Inserta un numero en una posición
    public static void ordenarD() {
        Collections.sort(AL);
        mostrar();

    }

    //MAIN
    public static void main(String[] args) {
        int numero;
        int guardar = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Elige (0-9):\n1.Agregar un número\n2.Busca un numero\n 3.Modifica un numero\n 4.Elimina un numero\n 5.Inserta un numero en una posición\n6. Mostrar elementos\n7.Ordenar ascendentemente\n8.Ordenar descendentemente\n9. Salir");
            int valor = sc.nextInt();
            guardar = valor;
            sc.nextLine();
            switch (valor) {
                case 1:
                    System.out.println("Que numero quieres agregar?");
                    numero = sc.nextInt();
                    sc.nextLine();
                    agregar(numero);
                    break;

                case 2:
                    System.out.println("Que numero quieres buscar?");
                    numero = sc.nextInt();
                    sc.nextLine();
                    buscar(numero);
                    break;
                case 3:
                    System.out.println("Que numero quieres modificar?");
                    numero = sc.nextInt();
                    sc.nextLine();
                    modificar(numero);
                    break;
                case 4:
                    System.out.println("Que elemento quieres eliminar?");
                    numero = sc.nextInt();
                    sc.nextLine();
                    eliminar(numero);
                    break;
                case 5:
                    System.out.println("En que posición quieres instertar? Y que elemento?");
                    numero = sc.nextInt();
                    sc.nextLine();
                    int elemento = sc.nextInt();
                    sc.nextLine();

                    insertar(numero, elemento);
                    break;
                case 6:
                    System.out.println("Mostrando...");
                    mostrar();
                    break;
                case 7:
                    ordenarA();
                    break;
                case 8:
                    ordenarD();
                    break;
            }
        } while (guardar < 9 && guardar > 0);
        System.out.println("Chao!!");

    }
}
