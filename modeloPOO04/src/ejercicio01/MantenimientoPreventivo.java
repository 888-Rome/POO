package ejercicio01;

import java.time.LocalDate;

public class MantenimientoPreventivo extends ServicioTecnico {
    private static final int VALOR_EQUIPO = 15;
    private int cantidadEquipos;
    private double tarifaPorEquipo;
    private boolean incluyeReemplazoFiltros;

    // Constructores:
    public MantenimientoPreventivo() {
    }
    public MantenimientoPreventivo(String tecnico, LocalDate fecha, String ubicacion, int cantidadEquipos, double tarifaPorEquipo, boolean incluyeReemplazoFiltros) {
        super(tecnico, fecha, ubicacion);
        this.cantidadEquipos = cantidadEquipos;
        this.tarifaPorEquipo = tarifaPorEquipo;
        this.incluyeReemplazoFiltros = incluyeReemplazoFiltros;
    }

    // Getters & Setters:
    public int getCantidadEquipos() {
        return cantidadEquipos;
    }
    public void setCantidadEquipos(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
    }

    public double getTarifaPorEquipo() {
        return tarifaPorEquipo;
    }
    public void setTarifaPorEquipo(double tarifaPorEquipo) {
        this.tarifaPorEquipo = tarifaPorEquipo;
    }

    public boolean isIncluyeReemplazoFiltros() {
        return incluyeReemplazoFiltros;
    }
    public void setIncluyeReemplazoFiltros(boolean incluyeReemplazoFiltros) {
        this.incluyeReemplazoFiltros = incluyeReemplazoFiltros;
    }

    // Métodos de clase:
    @Override
    public double costoMateriales() {
        if (incluyeReemplazoFiltros) {
            return cantidadEquipos * VALOR_EQUIPO;
        }

        return 0;
    }

    @Override
    public double costoManoObra() {
        return cantidadEquipos * tarifaPorEquipo;
    }

    public double costoTotal() {
        return costoMateriales() + costoManoObra();
    }

    public String mostrarDetalle() {
        String detalle = "";

        detalle += "DETALLE: ";
        detalle += "\n" + resumen();

        detalle += "\n" + " | Tarifa por equipo: " + tarifaPorEquipo;
        detalle += "\n" + " | Cantidad de equipos: " + cantidadEquipos;

        detalle += "\n" + "( Si incluye reemplazo de filtros: )";
        detalle += "\n" + " | Costo por equipo: " + VALOR_EQUIPO;

        detalle += "\n" + "Costo de materiales: " + costoMateriales();
        detalle += "\n" + "Costo de mano de obra: " + costoManoObra();

        detalle += "\n" + "TOTAL: " + costoTotal();

        return detalle;
    }

}
