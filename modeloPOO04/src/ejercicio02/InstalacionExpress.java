package ejercicio02;

public class InstalacionExpress {
    protected String tecnico;
    protected String ubicacion;
    protected int sensores;
    protected double precioSensor;

    // Constructores:
    public InstalacionExpress() {
    }
    public InstalacionExpress(String tecnico, String ubicacion, int sensores, double precioSensor) {
        this.tecnico = tecnico;
        this.ubicacion = ubicacion;
        this.sensores = sensores;
        this.precioSensor = precioSensor;
    }

    // Getters & Setters:
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getSensores() {
        return sensores;
    }
    public void setSensores(int sensores) {
        this.sensores = sensores;
    }

    public double getPrecioSensor() {
        return precioSensor;
    }
    public void setPrecioSensor(double precioSensor) {
        this.precioSensor = precioSensor;
    }

    // Métodos de clase:
    public String imprimirDetalle() {
        String detalle = "";

        detalle += "\n" + "Técnico: " + tecnico;
        detalle += "\n" + "Ubicación : " + ubicacion;
        detalle += "\n" + "Sensores: " + sensores;
        detalle += "\n" + "Precio: " + precioSensor;

        detalle += "\n" + "________________________" + tecnico;

        detalle += "\n" + "TOTAL: " + (sensores * precioSensor);

        detalle += "\n" + "RESUMEN: ";
        detalle += "\n" + "Instalación en " + ubicacion + " por " + tecnico;

        return detalle;
    }

}
