package Util;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class PositionFactory {
    private int initialCoordinateX = 0;
    private int initialCoordinateY = 0;

    public Position createInitialPosition(){
        Position position = new NorthPosition(initialCoordinateX, initialCoordinateY);
        return position;
    }

}
