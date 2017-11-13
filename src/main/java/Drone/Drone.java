package Drone;

import Util.Position;

public class  Drone {
    private Position position;

    public Drone(Position position) {
        this.position = position;
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position position){ this.position = position; }
}
