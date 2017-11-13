package Drone;

import Util.Instruction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joseberrio on 13/11/2017.
 */
public class DroneInstructionValidatorTest {
    @Test
    public void validateTurnLeftMustReturnTrue() {
        Assert.assertEquals(new DroneInstructionValidator().validateTurnLeft(new Instruction('I')), true);
    }

    @Test
    public void validateTurnRightMustReturnTrue() {
        Assert.assertEquals(new DroneInstructionValidator().validateTurnRight(new Instruction('D')), true);
    }

    @Test
    public void validateMoveMustReturnTrue() {
        Assert.assertEquals(new DroneInstructionValidator().validateMove(new Instruction('A')), true);
    }

    @Test
    public void validateInstructionMustValidateLeft() {
        Assert.assertEquals(new DroneInstructionValidator().validateInstruction(
                (new Instruction('I')).getInstructionValue(),
                DroneInstructions.TURN_LEFT.value()
        ), true);
    }

    @Test
    public void validateInstructionMustValidateRight() {
        Assert.assertEquals(new DroneInstructionValidator().validateInstruction(
                (new Instruction('D')).getInstructionValue(),
                DroneInstructions.TURN_RIGHT.value()
        ), true);
    }

    @Test
    public void validateInstructionMustValidateMove() {
        Assert.assertEquals(new DroneInstructionValidator().validateInstruction(
                (new Instruction('A')).getInstructionValue(),
                DroneInstructions.MOVE.value()
        ), true);
    }
}
