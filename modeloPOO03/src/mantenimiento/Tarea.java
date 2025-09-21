package mantenimiento;

import java.time.LocalDate;

public abstract class Tarea {
    protected String responsable;
    protected LocalDate fecha;
    protected String ubicacion;

    // Constructores
    public Tarea() {

    }
    public Tarea(String responsable, LocalDate fecha, String ubicacion) {
        this.responsable = responsable;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    // Métodos de la clase:
    public abstract double costoMateriales();
    public abstract double costoManoObra();
    public abstract double costoTotal();
}
