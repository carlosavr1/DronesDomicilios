package Util;


import mockit.integration.junit4.JMockit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(JMockit.class)
public class WestPositionerTest {

    WestPositioner westPositioner;
    Position originalPosition;

    @Before
    public void setup() {
        westPositioner = new WestPositioner();
        originalPosition = new Position(new Point(0,0), Directions.WEST);
    }

    @Test
    public void nextPositionChangePointCorrectly() {
        westPositioner.nextPosition(originalPosition);
        Position expectedPosition = new Position(new Point(-1,0), Directions.WEST);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void leftPositionChangeDirectionToSouth() {
        westPositioner.leftPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.SOUTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

    @Test
    public void rightPositionChangeDirectionToNorth() {
        westPositioner.rightPosition(originalPosition);
        Position expectedPosition = new Position(new Point(0,0), Directions.NORTH);

        assertEquals(originalPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(originalPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(originalPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }
}
