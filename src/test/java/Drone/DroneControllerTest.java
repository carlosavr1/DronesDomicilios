package Drone;

import Util.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;
import org.junit.Assert;

@RunWith(JMockit.class)
public class DroneControllerTest {

    private boolean leftPositionCalled = false;
    private boolean rightPositionCalled = false;
    private boolean nextPositionCalled = false;

    @Test
    public void createDroneMustReturnDrone() {
        Assert.assertThat(new DroneController().createDrone(), org.hamcrest.CoreMatchers.instanceOf(Drone.class));
    }

    @Test
    public void createPositionerMustReturnPositioner() {
        Assert.assertThat(new DroneController().createPositioner(Directions.NORTH), org.hamcrest.CoreMatchers.instanceOf(Positioner.class));
    }

    @Before
    public void setup() {
        new MockUp<NorthPositioner>() {
            @Mock
            public void leftPosition(Position position) {
                leftPositionCalled = true;
            }
        };

        new MockUp<NorthPositioner>() {
            @Mock
            public void rightPosition(Position position) {
                rightPositionCalled = true;
            }
        };

        new MockUp<NorthPositioner>() {
            @Mock
            public void nextPosition(Position position) {
                nextPositionCalled = true;
            }
        };
    }

    @Test
    public void executeInstructionMustCallLeftPosition() {
        DroneController droneCtrl = new DroneController();
        droneCtrl.executeInstruction(new DroneController().createDrone(), new Instruction('I'));
        Assert.assertEquals(leftPositionCalled,true);

    }

    @Test
    public void executeInstructionMustCallRightPosition() {
        DroneController droneCtrl = new DroneController();
        droneCtrl.executeInstruction(new DroneController().createDrone(), new Instruction('D'));
        Assert.assertEquals(rightPositionCalled,true);

    }

    @Test
    public void executeInstructionMustCallNextPosition() {
        DroneController droneCtrl = new DroneController();
        droneCtrl.executeInstruction(new DroneController().createDrone(), new Instruction('A'));
        Assert.assertEquals(nextPositionCalled,true);

    }
}