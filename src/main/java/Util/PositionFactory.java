package Util;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class PositionFactory {
    private int initialCoordinateX = 0;
    private int initialCoordinateY = 0;

    public Position createInitialPosition(){
        Position position = new NorthPosition(initialCoordinateX, initialCoordinateY);
        return position;
    }

    public Position createNorthPosition(int coordinateX, int coordinateY){
        Position position = new NorthPosition(coordinateX, coordinateY);
        return position;
    }

    public Position createEastPosition(int coordinateX, int coordinateY){
        Position position = new EastPosition(coordinateX, coordinateY);
        return position;
    }

    public Position createSouthPosition(int coordinateX, int coordinateY){
        Position position = new SouthPosition(coordinateX, coordinateY);
        return position;
    }

    public Position createWestPosition(int coordinateX, int coordinateY){
        Position position = new WestPosition(coordinateX, coordinateY);
        return position;
    }

    public Position createPositionWithDirectionAndCoordinates(Directions direction, int coordinateX, int coordinateY){
        Position position = null;
        if(direction.equals(Directions.NORTH)){
            position = new NorthPosition(coordinateX, coordinateY);
        }else if(direction.equals(Directions.EAST)){
            position = new EastPosition(coordinateX, coordinateY);
        }else if(direction.equals(Directions.SOUTH)){
            position = new SouthPosition(coordinateX, coordinateY);
        }else if(direction.equals(Directions.WEST)){
            position = new WestPosition(coordinateX, coordinateY);
        }
        return position;
    }

}
