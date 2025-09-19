package modelos;

import java.time.LocalDate;

public class InstalacionSensores extends AServicio {
    /*
    Describe la instalación de sensores de
    movimiento, puertas/ventanas y sensores
    ambientales.
     */

    private static final double DTO_VOLUMEN = 0.08;
    private int numeroSensores;
    private double precioSensor;  // En euros.


    // Constructores
    public InstalacionSensores() {
    }
    public InstalacionSensores(String trabajador, LocalDate fechaInicio, String cliente, int numeroSensores, double precioSensor) {
        super(trabajador, fechaInicio, cliente);
        this.numeroSensores = numeroSensores;
        this.precioSensor = precioSensor;
    }

    // Getters & Setters
    public int getNumeroSensores() {
        return numeroSensores;
    }

    public void setNumeroSensores(int numeroSensores) {
        this.numeroSensores = numeroSensores;
    }

    public double getPrecioSensor() {
        return precioSensor;
    }

    public void setPrecioSensor(double precioSensor) {
        this.precioSensor = precioSensor;
    }

    // Métodos Sobreescritos:
    boolean aplicaDescuento() {
        return numeroSensores > 20;
    }

    double descuentoTotal() {
        return (numeroSensores * precioSensor) * DTO_VOLUMEN;
    }

    @Override
    public double costeMaterial() {

        if (!aplicaDescuento()) {
            return numeroSensores * precioSensor;
        }

        return (numeroSensores * precioSensor) - descuentoTotal();
    }

    @Override
    public double costeManoObra() {
        float TIEMPO_INDIVIDUAL = 0.75f;
        float PRECIO_POR_HORA = 28;

        return numeroSensores * TIEMPO_INDIVIDUAL * PRECIO_POR_HORA;
    }

    @Override
    public double costeTotal() {
        return costeMaterial() + costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String detalle = "";

        detalle += "INSTALACIÓN DE SENSORES";

        detalle += "\n  |  Cliente: " + cliente;
        detalle += "\n  |  Fecha de inicio: " + fechaInicio;
        detalle += "\n  |  Técnico: " + trabajador;
        detalle += "\n  |  Nº Sensores: " + numeroSensores;
        detalle += "\n  |  Coste Material: " + costeMaterial();
        detalle += "\n  |  Coste Mano Obra: " + costeManoObra();
        detalle += "\n  |  Descuento Volumen: " + descuentoTotal();
        detalle += "\nTOTAL: " + costeTotal();

        return detalle;
    }

}
