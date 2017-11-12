package Drone;

import Util.NorthPosition;
import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class Drone {
    private Position position;

    public Drone() {}

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position position){ this.position = position; }
}
