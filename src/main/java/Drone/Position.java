package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public abstract class Position {

    protected int coordinateX;
    protected int coordinateY;

    public Position(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public abstract void move();

}
