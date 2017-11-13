package Util;

/**
 * Created by carlvarn on 12/11/2017.
 */
public abstract class Positioner {

    PositionFactory positionFactory = null;


    public Positioner(){
        positionFactory = new PositionFactory();
    }

    public abstract void nextPosition(Position position);

    public abstract void leftPosition(Position position);

    public abstract void rightPosition(Position position);


}
