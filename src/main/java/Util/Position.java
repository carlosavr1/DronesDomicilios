package Util;

/**
 * Created by carlvarn on 12/11/2017.
 */
public abstract class Position {

    public int coordinateX;
    public int coordinateY;

    public Position(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public abstract Position nextPosition();

    public abstract void printPosition();

}
