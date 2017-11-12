package Drone;

import Util.Instruction;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class DroneInstructionValidator {
    private boolean validateEvent(char eventName, char eventToCompare){
        return eventName == eventToCompare;
    }

    public boolean validateMove(Instruction instruction){
        return validateEvent(instruction.getInstructionValue(), DroneInstructions.MOVE.value());
    }

    public boolean validateTurnLeft(Instruction instruction){
        return validateEvent(instruction.getInstructionValue(), DroneInstructions.TURN_LEFT.value());
    }

    public boolean validateTurnRight(Instruction instruction){
        return validateEvent(instruction.getInstructionValue(), DroneInstructions.TURN_RIGHT.value());
    }
}
