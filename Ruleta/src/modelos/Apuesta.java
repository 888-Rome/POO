package modelos;

import enums.TipoApuesta;
import excepciones.MontoApuestaInvalidoException;

/*
 * Representa una apuesta realizada, incluye la validación del monto
 * (lanza excepciones del tipo MontoApuestaInvalidoException).
 */

public class Apuesta {
    // Atributos:
    private static final double MIN_APUESTA = 10.0;
    private static final double MAX_APUESTA = 5000.0;

    private final double monto;
    private final TipoApuesta tipo;
    private final Object valor; // TODO

    // Constructor
    // 01) Vacío:
    // Constructor requerido por compatibilidad académica. No representa una apuesta válida.
    public Apuesta() {
        this.monto = MIN_APUESTA;
        this.tipo = null;
        this.valor = null;
    }

    // 02) Completo:
    public Apuesta(double monto, TipoApuesta tipo, Object valor) throws MontoApuestaInvalidoException {
        if (monto < MIN_APUESTA || monto > MAX_APUESTA) {
            throw new MontoApuestaInvalidoException(
                "El monto de la apuesta ($" + monto + ") debe estar entre $" +
                MIN_APUESTA + " y $" + MAX_APUESTA + "."
            );
        }

        this.monto = monto;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters
    public double getMonto() { return monto; }
    public TipoApuesta getTipo() { return tipo; }
    public Object getValor() { return valor; }
}