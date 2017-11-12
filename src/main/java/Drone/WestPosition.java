package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class WestPosition extends Position {

    public WestPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public void move() {
        this.coordinateX--;
    }
}
