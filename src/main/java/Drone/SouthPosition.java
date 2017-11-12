package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class SouthPosition extends Position {

    public SouthPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public void move() {
        this.coordinateY--;
    }
}
