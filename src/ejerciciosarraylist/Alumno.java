package ejerciciosarraylist;

/**
 * @author Diego Romero
 * @company Alumno
 * @Email 10778820@ieselgrao.org
 */
public class Alumno {

    //ATRIBUTOS
    String nombre;
    double Nota;

    //CONSTRUCTOR CON PARAMETROS
    public Alumno(String name, int nota) {
        nombre = name;
        Nota = nota;
    }

    //METODOS GETTER 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public double getNota() {
        return Nota;
    }
    
    public void Ordenar() {
        
    }
}
