public class Cliente {
    /*
    El siguiente código tiene errores de diseño y rompe buenas prácticas de POO.

    Reescribir aplicando:
    - Encapsulamiento correcto
    - Uso de constructor
    - Eliminación de código duplicado
    - Uso de constantes si corresponde
     */

    protected String nombre;
    protected String apellido;
    protected int edad;

    // Constructores
    public Cliente() {

    }
    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters & Setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos de la clase:
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
    }

}
