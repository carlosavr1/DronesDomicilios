package Util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EastPositionerTest {

    EastPositioner eastPositioner;
    Position originalPosition;

    @Before
    public void setup() {
        eastPositioner = new EastPositioner();
        originalPosition = new Position(new Point(0,0), Directions.EAST);
    }

    @Test
    public void nextPositionChangePointCorrectly() {
        eastPositioner.nextPosition(originalPosition);
        Position expectedPosition = new Position(new Point(1,0), Directions.EAST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void leftPositionChangeDirectionToNorth() {
        eastPositioner.leftPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.NORTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void rightPositionChangeDirectionToSouth() {
        eastPositioner.rightPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.SOUTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }
}
