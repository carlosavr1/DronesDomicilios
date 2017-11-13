package Util;

public class EastPositioner extends Positioner {

    public EastPositioner(){
        super();
    }

    @Override
    public void nextPosition(Position position) {
        position.getPoint().setCoordinateX(position.getPoint().getCoordinateX() + 1);
    }

    @Override
    public void leftPosition(Position position){
        position.setDirection(Directions.NORTH);
    }

    @Override
    public void rightPosition(Position position){
        position.setDirection(Directions.SOUTH);
    }

}
