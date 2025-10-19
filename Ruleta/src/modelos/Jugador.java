package modelos;

/*
 * Representa al jugador y gestiona su saldo (lanza excepciones SaldoInsuficienteException).
 */

import excepciones.SaldoInsuficienteException;

public class Jugador {
    // Atributos:
    private final String nombreUsuario;
    private double saldo;

    // Constructor:
    // 1) Vacío
    // Constructor requerido por compatibilidad académica. No representa una apuesta válida.
    public Jugador() {
        this.nombreUsuario = "SinEspecificar";
        this.saldo = 0;
    }

    // 2) Completo
    public Jugador(String nombreUsuario, double saldoInicial) {
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldoInicial;
    }

    // Métodos de la clase:

    // Descuenta el monto de la apuesta:
    public void apostar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente. Saldo actual: $" + saldo + ". Necesitas $" + monto + "."
            );
        }

        this.saldo -= monto;
    }

    // Añade la ganancia al saldo:
    public void cobrar(double ganancia) {
        this.saldo += ganancia;
    }

    // Getters:
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public double getSaldo() {
        return saldo;
    }

    // ToString:
    @Override
    public String toString() {
        return "Jugador: " + nombreUsuario + " | Saldo: $" + saldo;
    }
}