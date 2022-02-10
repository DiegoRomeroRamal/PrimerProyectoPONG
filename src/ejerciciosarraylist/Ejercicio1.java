package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Diego Romero
 * @company EjerciciosArraylist
 * @Email 10778820@ieselgrao.org
 */
public class Ejercicio1 {

    //Metodos
    //Pedir valores
    public static ArrayList LeerValores() {
        int number;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        do {
            System.out.println("Pasame enteros");
            number = sc.nextInt();
            if (number != -99) {
                al.add(number);
            }
            sc.nextLine();
        } while (number != -99);
        return al;
    }

    //Metodo suma
    public static int calcularSuma(ArrayList<Integer> al) {
        Iterator<Integer> it = al.iterator();
        int suma = 0;
        while (it.hasNext()) {
            suma = suma + it.next();
        }
        return suma;
    }

    //Metodo MostrarResultados
    public static void MostrarResultados(ArrayList<Integer> al, int suma, int media) {
        System.out.println("Media "+media);
        System.out.println("Suma "+suma);
        Iterator<Integer> it = al.iterator();
        for (int elemento:al) {
            if (elemento >= media) {
                System.out.println("Elemento mayor a la media "+elemento);
            }
        }
    }

    //Main
    public static void main(String[] args) {
        ArrayList<Integer> main = LeerValores();
        int media = calcularSuma(main)/2;
       MostrarResultados(main, calcularSuma(main), media);
        
    }

}
