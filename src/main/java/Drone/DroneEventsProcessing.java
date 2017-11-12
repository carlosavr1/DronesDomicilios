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
        return validateEvent(eventName, DroneEvents.MOVE);
    }

    public boolean validateTurnLeft(char eventName){
        return validateEvent(eventName, DroneEvents.TURN_LEFT);
    }

    public boolean validateTurnRight(char eventName){
        return validateEvent(eventName, DroneEvents.TURN_RIGHT);
    }

    public void event(Drone drone, char eventName){}

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
