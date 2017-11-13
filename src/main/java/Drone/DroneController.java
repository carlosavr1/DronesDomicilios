package Drone;

import Util.*;

public class DroneController {
    DroneInstructionValidator droneInstructionValidator;
    PositionFactory positionFactory;

    public DroneController(){
        droneInstructionValidator = new DroneInstructionValidator();
        positionFactory = new PositionFactory();
    }

    public Drone createDrone(){
        Drone drone = new Drone(positionFactory.createInitialPosition());
        return drone;
    }

    public void executeInstruction(Drone drone, Instruction instruction){
        Positioner positioner = createPositioner(drone.getPosition().getDirection());
        if(droneInstructionValidator.validateTurnLeft(instruction)){
            positioner.leftPosition(drone.getPosition());
        }else if(droneInstructionValidator.validateTurnRight(instruction)){
            positioner.rightPosition(drone.getPosition());
        }else if(droneInstructionValidator.validateMove(instruction)){
            positioner.nextPosition(drone.getPosition());
        }
    }

    protected Positioner createPositioner(Directions actualDirection){
        Positioner positioner = null;
        if(actualDirection.equals(Directions.NORTH)){
            positioner = new NorthPositioner();
        }else if(actualDirection.equals(Directions.EAST)){
            positioner = new EastPositioner();
        }else if(actualDirection.equals(Directions.SOUTH)){
            positioner = new SouthPositioner();
        }else if(actualDirection.equals(Directions.WEST)){
            positioner = new WestPositioner();
        }
        return positioner;
    }


}
