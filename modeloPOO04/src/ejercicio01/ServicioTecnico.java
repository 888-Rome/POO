package ejercicio01;

import java.time.LocalDate;

public abstract class ServicioTecnico {
    protected String tecnico;
    protected LocalDate fecha;
    protected String ubicacion;

    public ServicioTecnico() {

    }

    public ServicioTecnico(String tecnico, LocalDate fecha, String ubicacion) {
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public abstract double costoMateriales();
    public abstract double costoManoObra();
    public abstract double costoTotal();

    public String resumen() {
        return "Servicio en " + ubicacion + " por " + tecnico + " el " + fecha;
    }
}
