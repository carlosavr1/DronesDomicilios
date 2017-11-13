package Util;

public class Position {

    private Point point;
    private Directions direction;

    public Position(Point point, Directions direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point getPoint(){
        return point;
    }

    public Directions getDirection(){
        return direction;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public void setDirection(Directions direction){
        this.direction = direction;
    }

    @Override
    public String toString(){
        return "("+this.point.getCoordinateX()+", "+this.point.getCoordinateY()+") "+this.direction.value();
    }

}
