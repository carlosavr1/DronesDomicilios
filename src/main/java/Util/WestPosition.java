package Util;

import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class WestPosition extends Position {

    public WestPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public Position nextPosition() {
        this.coordinateX--;
        return this;
    }

    @Override
    public Directions left(){
        return Directions.SOUTH;
    }

    @Override
    public Directions right(){
        return Directions.NORTH;
    }

    @Override
    public String position(){
        return "("+coordinateX+", "+coordinateY+") dirección Oeste";
    }

    @Override
    public void printPosition(){
        System.out.println(position());
    }

}
