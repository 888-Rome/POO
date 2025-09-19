package testeos;

import modelos.AServicio;
import modelos.CalibracionSistema;
import modelos.InstalacionSensores;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InstalacionSensores i1 = new InstalacionSensores("Laura Martín", LocalDate.of(2025,10,2), "Residencial Altos del Parque", 10, 18.5f);
        InstalacionSensores i2 = new InstalacionSensores("Carlos Pérez" ,LocalDate.of(2025,9,20) ,"Oficinas Soluciones SA" ,25, 16.0f);

        CalibracionSistema c1 = new CalibracionSistema("Ana Ruiz", LocalDate.of(2025,11,5), "Hotel Aurora", 2.5f, 35.0f);
        CalibracionSistema c2 = new CalibracionSistema("Sergio Gómez", LocalDate.of(2025,12,7), "Centro Comercial Luna", 5, 40.0f);

        // Almacenar los servicios en un array:
        ArrayList<AServicio> servicios = new ArrayList<>();

        servicios.add(i1);
        servicios.add(i2);

        servicios.add(c1);
        servicios.add(c2);

        // Totales
        double sumaTotales = 0;
        double sumaSueldos = 0;

        // Contadores
        int cantCalibracion = 0;
        int cantInstalacion = 0;
        int totalServicios = 0;

        for (AServicio s : servicios) {

            // Totales
            sumaTotales += s.costeTotal();
            sumaSueldos += s.costeManoObra();

            System.out.println("\n" + s.detalleServicio());

            // Contadores
            if (s instanceof CalibracionSistema) {
                cantCalibracion += 1;
            }

            if (s instanceof InstalacionSensores) {
                cantInstalacion += 1;
            }

            totalServicios = cantCalibracion + cantInstalacion;

        }


        System.out.println("\nCantidad total de servicios procesados: " + totalServicios);
        System.out.println("  | Cantidad de servicios de calibracion: " + cantCalibracion);
        System.out.println("  | Cantidad de servicios de instalacion: " + cantInstalacion);

        System.out.println("\nGRAN TOTAL: " + sumaTotales);

    }
}
