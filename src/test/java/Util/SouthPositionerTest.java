package Util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SouthPositionerTest {

    SouthPositioner southPositioner;
    Position originalPosition;

    @Before
    public void setup() {
        southPositioner = new SouthPositioner();
        originalPosition = new Position(new Point(0,0), Directions.SOUTH);
    }

    @Test
    public void nextPositionChangePointCorrectly() {
        southPositioner.nextPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,-1), Directions.SOUTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void leftPositionChangeDirectionToEast() {
        southPositioner.leftPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.EAST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void rightPositionChangeDirectionToWest() {
        southPositioner.rightPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.WEST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }
}