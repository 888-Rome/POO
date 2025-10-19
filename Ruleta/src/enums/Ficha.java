package enums;

/*
 * Enum que representa los valores de fichas disponibles para realizar apuestas.
 * Cada constante incluye su valor monetario asociado.
 */

public enum Ficha {
    DIEZ(10),
    VEINTICINCO(25),
    CINCUENTA(50),
    CIEN(100),
    DOSCIENTOS_CINCUENTA(250);

    // Atributo:
    private final int valor;

    // Constructor
    Ficha(int valor) { this.valor = valor; }

    // Getter:
    public int getValor() { return valor; }

}
