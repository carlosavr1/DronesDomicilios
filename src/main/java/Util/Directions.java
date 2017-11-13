package Util;

/**
 * Created by carlvarn on 12/11/2017.
 */
public enum Directions {
    NORTH("dirección Norte"),
    EAST("dirección Este"),
    SOUTH("dirección Sur"),
    WEST("dirección Oeste");

    public String value() {
        return value;
    }

    private Directions(String value) {
        this.value = value;
    }

    private final String value;
}
