package modelos;

/*
 * Representa cada uno de los 50 espacios de la ruleta (número y color).
 */

import enums.Color;

public class Casilla {
    // Atributos:
    private final int numero;
    private final Color color;

    // Constructor:
    // 1) Vacío:
    // Constructor requerido por compatibilidad académica.
    public Casilla() {
        this.numero = 0;
        this.color = null;
    }

    // 2) Completo:
    public Casilla(int numero, Color color) {
        this.numero = numero;
        this.color = color;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Color getColor() {
        return color;
    }

    // ToString:
    @Override
    public String toString() {
        return "[" + numero + ", " + color + "]";
    }
}
