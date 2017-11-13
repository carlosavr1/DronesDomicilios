package Util;

public class NorthPositioner extends Positioner {

    public NorthPositioner(){
        super();
    }

    @Override
    public void nextPosition(Position position) {
        position.getPoint().setCoordinateY(position.getPoint().getCoordinateY() + 1);
    }

    @Override
    public void leftPosition(Position position){
        position.setDirection(Directions.WEST);
    }

    @Override
    public void rightPosition(Position position){
        position.setDirection(Directions.EAST);
    }

}
