package Util;

import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class NorthPosition extends Position {

    public NorthPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public Position nextPosition() {
        this.coordinateY++;
        return this;
    }

    @Override
    public Directions left(){
        return Directions.WEST;
    }

    @Override
    public Directions right(){
        return Directions.EAST;
    }

    @Override
    public String position(){
        return "("+coordinateX+", "+coordinateY+") dirección Norte";
    }

    @Override
    public void printPosition(){
        System.out.println(position());
    }

}
