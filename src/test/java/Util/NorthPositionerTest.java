package Util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlvarn on 13/11/2017.
 */
public class NorthPositionerTest {

    NorthPositioner northPositioner;
    Position originalPosition;

    @Before
    public void setup() {
        northPositioner = new NorthPositioner();
        originalPosition = new Position(new Point(0,0), Directions.NORTH);
    }

    @Test
    public void nextPositionChangePointCorrectly() {
        northPositioner.nextPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,1), Directions.NORTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void leftPositionChangeDirectionToWest() {
        northPositioner.leftPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.WEST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void rightPositionChangeDirectionToEast() {
        northPositioner.rightPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.EAST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }
}

