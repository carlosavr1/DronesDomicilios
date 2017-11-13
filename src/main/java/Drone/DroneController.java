package Drone;

import Util.*;

/**
 * Created by carlvarn on 12/11/2017.
 */
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
        if(droneInstructionValidator.validateTurnLeft(instruction)){
            turnLeft(drone);
        }else if(droneInstructionValidator.validateTurnRight(instruction)){
            turnRight(drone);
        }else if(droneInstructionValidator.validateMove(instruction)){
            drone.setPosition(drone.getPosition().nextPosition());
        }
    }

    private void turnLeft(Drone drone){
        Position position = positionFactory.createPositionWithDirectionAndCoordinates(drone.getPosition().left(),drone.getPosition().coordinateX, drone.getPosition().coordinateY);
        drone.setPosition(position);
    }

    private void turnRight(Drone drone){
        Position position = positionFactory.createPositionWithDirectionAndCoordinates(drone.getPosition().right(),drone.getPosition().coordinateX, drone.getPosition().coordinateY);
        drone.setPosition(position);
    }

}
