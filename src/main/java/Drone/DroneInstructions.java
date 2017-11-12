package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public enum DroneInstructions {
    MOVE('A'),
    TURN_LEFT('I'),
    TURN_RIGHT('D');

    public char value() {
        return value;
    }

    private DroneInstructions(char value) {
        this.value = value;
    }

    private final char value;
}