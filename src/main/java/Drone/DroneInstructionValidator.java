package Drone;

import Util.Instruction;

public class DroneInstructionValidator {
    protected boolean validateInstruction(char instructionName, char instructionToCompare){
        return instructionName == instructionToCompare;
    }

    public boolean validateMove(Instruction instruction){
        return validateInstruction(instruction.getInstructionValue(), DroneInstructions.MOVE.value());
    }

    public boolean validateTurnLeft(Instruction instruction){
        return validateInstruction(instruction.getInstructionValue(), DroneInstructions.TURN_LEFT.value());
    }

    public boolean validateTurnRight(Instruction instruction){
        return validateInstruction(instruction.getInstructionValue(), DroneInstructions.TURN_RIGHT.value());
    }
}
