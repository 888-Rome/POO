package modelos;

import java.time.LocalDate;

public abstract class AServicio {
    String trabajador;    // nombre, apellidos
    LocalDate fechaInicio;    // formato fecha:
    String cliente;    // nombre, apellidos o razón social

    // Constructores
    public AServicio() {
    }
    public AServicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    // Getters & Setters
    public String getTrabajador() {
        return trabajador;
    }
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // toString()
    @Override
    public String toString() {
        return "AServicio{" +
                "trabajador='" + trabajador + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", cliente='" + cliente + '\'' +
                '}';
    }

    // Métodos abstractos
    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();

}
