package ejerciciosarraylist;

/**
 *
 * @author Diego Romero 
 * @company Persona
 * @Email 10778820@ieselgrao.org
 */
public class Persona {
    //n personas (dni, nombre, sexo, edad, peso9

        //ATRIBUTOS
        private String nombre;
        private String apellidos;
        private String sexo;
        private int edad;
        private double peso;
        private String dni;

        public Persona(String dni, String nombre, String apellidos, String sexo, int edad, double peso) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.sexo = sexo;
            this.edad = edad;
            this.peso = peso;
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

    public String getDni() {
        return dni;
    }

        public String getApellidos() {
            return apellidos;
        }

        public String getSexo() {
            return sexo;
        }

        public int getEdad() {
            return edad;
        }

        public double getPeso() {
            return peso;
        }
        
        
}
