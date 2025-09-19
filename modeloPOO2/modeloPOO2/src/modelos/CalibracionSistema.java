package modelos;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalibracionSistema extends AServicio {
    /*
    Describe la calibración y puesta a punto de
    un sistema domótico existente.
     */

    private double MATERIAL_CONSUMIBLE = 12;
    private double horasTrabajo;
    private double tarifaHora;

    // Constructores
    public CalibracionSistema(){
    }
    public CalibracionSistema(String trabajador, LocalDate fechaInicio, String cliente, double horasTrabajo, double tarifaHora) {
        super(trabajador, fechaInicio, cliente);
        this.horasTrabajo = horasTrabajo;
        this.tarifaHora = tarifaHora;
    }

    // Getters & Setters
    public double getHorasTrabajo() {
        return horasTrabajo;
    }
    public void setHorasTrabajo(double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // toString()
    @Override
    public String toString() {
        return "CalibracionSistema{" +
                "horasTrabajo=" + horasTrabajo +
                ", tarifaHora=" + tarifaHora +
                ", trabajador='" + trabajador + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", cliente='" + cliente + '\'' +
                '}';
    }

    // cambiar nombre
    boolean masDeTresHoras() {
        return horasTrabajo > 3;
    }
    boolean esFinSemana() {
        DayOfWeek dia = fechaInicio.getDayOfWeek();

        return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
    }
    double recargoTotal() {
        if (esFinSemana()) {
            return 0.25 * (horasTrabajo * tarifaHora);
        }

        return 0.0;
    }

    @Override
    public double costeMaterial() {

        if (masDeTresHoras()) {
            return MATERIAL_CONSUMIBLE;
        }

        return MATERIAL_CONSUMIBLE * 0.5f;
    }

    @Override
    public double costeManoObra() {
        return (horasTrabajo * tarifaHora) + recargoTotal();
    }

    @Override
    public double costeTotal() {
        return costeMaterial() + costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String detalle = "";

        detalle += "CALIBRACIÓN DE SISTEMA";

        detalle += "\n  |  Cliente: " + cliente;
        detalle += "\n  |  Fecha de inicio: " + fechaInicio;
        detalle += "\n  |  Técnico: " + trabajador;
        detalle += "\n  |  Horas Trabajo: " + horasTrabajo;
        detalle += "\n  |  Coste Material: " + costeMaterial();
        detalle += "\n  |  Coste Mano Obra: " + costeManoObra();
        detalle += "\n  |  Recargo Fin de Semana:: " + recargoTotal();
        detalle += "\nTOTAL: " + costeTotal();

        return detalle;
    }
}
