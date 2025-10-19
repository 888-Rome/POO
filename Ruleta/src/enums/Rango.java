package enums;

/*
 * Enum que define los rangos fijos de números utilizados
 * en apuestas por rango.
 *
 * Cada constante incluye el número inicial y final del
 * rango.
 */

public enum Rango {
    PRIMERA(1, 25),
    SEGUNDA(26, 50);

    // Atributos:
    private final int inicio;
    private final int fin;

    // Constructor:
    Rango(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getInicio() { return inicio; }
    public int getFin() { return fin; }
}
