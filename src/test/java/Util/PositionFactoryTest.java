package Util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PositionFactoryTest {
    @Test
    public void createInitialPositionMustInitDrone() {
        Position initialPosition = new PositionFactory().createInitialPosition();

        Position expectedPosition = new Position(new Point(0,0), Directions.NORTH);

        assertEquals(initialPosition.getDirection().value(), expectedPosition.getDirection().value());
        assertEquals(initialPosition.getPoint().getCoordinateX(), expectedPosition.getPoint().getCoordinateX());
        assertEquals(initialPosition.getPoint().getCoordinateY(), expectedPosition.getPoint().getCoordinateY());
    }

}
