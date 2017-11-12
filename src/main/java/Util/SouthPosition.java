package Util;

import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class SouthPosition extends Position {

    public SouthPosition(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }

    @Override
    public Position nextPosition() {
        this.coordinateY--;
        return this;
    }

    @Override
    public void printPosition(){
        System.out.println("("+coordinateX+", "+coordinateY+") dirección Sur");
    }
}
