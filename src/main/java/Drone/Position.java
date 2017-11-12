package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public interface Position {

    int coordinateX = 0;
    int coordinateY = 0;
    char orientation = 'N';

    public void move();

}
