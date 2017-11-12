package Drone;

import Util.*;

/**
 * Created by carlvarn on 12/11/2017.
 */
public abstract class DroneEventsProcessing {

    private boolean validateEvent(char eventName, char eventToCompare){
        return eventName == eventToCompare;
    }

    public boolean validateMove(char eventName){
        return validateEvent(eventName, DroneInstructions.MOVE.value());
    }

    public boolean validateTurnLeft(char eventName){
        return validateEvent(eventName, DroneInstructions.TURN_LEFT.value());
    }

    public boolean validateTurnRight(char eventName){
        return validateEvent(eventName, DroneInstructions.TURN_RIGHT.value());
    }

    public void executeInstruction(Drone drone, Instruction instruction){}

    public void turnLeft(Drone drone){
      if(drone.getPosition() instanceof NorthPosition){
          Position position = new WestPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
          drone.setPosition(position);
      }else if(drone.getPosition() instanceof WestPosition){
          Position position = new SouthPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
          drone.setPosition(position);
      }else if(drone.getPosition() instanceof SouthPosition){
          Position position = new EastPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
          drone.setPosition(position);
      }else if(drone.getPosition() instanceof EastPosition) {
          Position position = new NorthPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
          drone.setPosition(position);
      }
    }

    public void turnRight(Drone drone){
        if(drone.getPosition() instanceof NorthPosition){
            Position position = new EastPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
            drone.setPosition(position);
        }else if(drone.getPosition() instanceof EastPosition){
            Position position = new SouthPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
            drone.setPosition(position);
        }else if(drone.getPosition() instanceof SouthPosition){
            Position position = new WestPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
            drone.setPosition(position);
        }else if(drone.getPosition() instanceof WestPosition) {
            Position position = new NorthPosition(drone.getPosition().coordinateX, drone.getPosition().coordinateY);
            drone.setPosition(position);
        }
    }
}
