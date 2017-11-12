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
    public void printPosition(){
        System.out.println("("+coordinateX+", "+coordinateY+") dirección Oeste");
    }
}
