package Util;

import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class EastPosition extends Position {

    public EastPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public Position nextPosition() {
        this.coordinateX++;
        return this;
    }

    @Override
    public Directions left(){
        return Directions.NORTH;
    }

    @Override
    public Directions right(){
        return Directions.SOUTH;
    }

    @Override
    public String position(){
        return "("+coordinateX+", "+coordinateY+") dirección Este";
    }

    @Override
    public void printPosition(){
        System.out.println(position());
    }
}
