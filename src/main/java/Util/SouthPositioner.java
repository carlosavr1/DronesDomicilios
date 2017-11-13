package Util;

public class SouthPositioner extends Positioner {

    public SouthPositioner(){
        super();
    }

    @Override
    public void nextPosition(Position position) {
        position.getPoint().setCoordinateY(position.getPoint().getCoordinateY() - 1);
    }

    @Override
    public void leftPosition(Position position){
        position.setDirection(Directions.EAST);
    }

    @Override
    public void rightPosition(Position position){
        position.setDirection(Directions.WEST);
    }

}
