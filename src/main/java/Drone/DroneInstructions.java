package Drone;

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