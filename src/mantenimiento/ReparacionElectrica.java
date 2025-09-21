package mantenimiento;

import java.time.LocalDate;

public class ReparacionElectrica extends Tarea {
    private int cantidadHoras;
    private double tarifaHora;
    private double costoMateriales;

    // Constructores:
    public ReparacionElectrica() {
    }
    public ReparacionElectrica(int cantidadHoras, double tarifaHora, double costoMateriales, String responsable, LocalDate fecha, String ubicacion){
        super(responsable, fecha, ubicacion);
        this.cantidadHoras = cantidadHoras;
        this.tarifaHora = tarifaHora;
        this.costoMateriales = costoMateriales;
    }

    // Métodos de la clase:
    @Override
    public double costoMateriales() {
        return this.costoMateriales;
    }

    @Override
    public double costoManoObra() {
        return cantidadHoras*tarifaHora;
    }

    @Override
    public double costoTotal() {
        return costoMateriales() + costoManoObra();
    }
}
