package ejerciciosarraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Diego Romero
 * @company Ejercicio4
 * @Email 10778820@ieselgrao.org
 */
public class Ejercicio4 {

    static ArrayList<Persona> aea = new ArrayList<Persona>();

    public static void OrdenarPorNombre() {
        Collections.sort(aea, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
    }

    public static void OrdenarPorApellidos() {
        Collections.sort(aea, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getApellidos().compareTo(p2.getApellidos());
            }
        });

    }

    public static void BuscarDNI(String dni) {
        for (int a = 0; a < aea.size(); a++) {
            if (aea.get(a).getDni().equals(dni)) {
                System.out.println(aea.get(a).getNombre());
            }
        }
    }

    public static void EliminarDNI(String dni) {
        for (int a = 0; a < aea.size(); a++) {
            if (aea.get(a).getDni().equals(dni)) {
                aea.remove(a);
            }

        }
    }

    public static void MostrarTodo() {
        if (aea.size() > 0) {
            for (Persona p : aea) {
                System.out.println(p.getDni());
                System.out.println(p.getEdad());
                System.out.println(p.getNombre());
                System.out.println(p.getApellidos());
                System.out.println(p.getSexo());
                System.out.println(p.getPeso());
            }
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aea.add(new Persona("9999999X", "Juan", "De la Vega", "H", 18, 80));
        aea.add(new Persona("9999999Y", "Diego", "De la Vega", "H", 18, 80));
        aea.add(new Persona("9999999Y", "Ana", "De la Vega", "H", 18, 80));
        System.out.println("Dime que quieres hacer:");
        System.out.println("Ordenar por nombre (1)");
        System.out.println("Ordenar por apellidos (2)");
        System.out.println("Buscar por DNI (3)");
        System.out.println("Eliminar por DNI (4)");
        System.out.println("Mostrar Todo (5)");
        System.out.println("Terminar (6)");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                OrdenarPorNombre();
                break;

            case 2:
                OrdenarPorApellidos();
                break;

            case 3:
                System.out.println("Introduce el DNI buscado:");
                String BuscarrDNI = sc.nextLine();
                BuscarDNI(BuscarrDNI);
                break;

            case 4:
                System.out.println("Introduce el DNI buscado:");
                String EliminarrDNI = sc.nextLine();
                EliminarDNI(EliminarrDNI);
                break;

            case 5:
                MostrarTodo();
                break;
                
            case 6:
                break;

        }

    }
}
