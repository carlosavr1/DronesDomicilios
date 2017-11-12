package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public enum DroneEvents {
    MOVE('A'),
    TURN_LEFT('I'),
    TURN_RIGHT('D');

    public char value() {
        return value;
    }

    private DroneEvents(char value) {
        this.value = value;
    }

    private final char value;
}