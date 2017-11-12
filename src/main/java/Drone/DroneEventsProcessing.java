package Drone;

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

    public boolean move(Drone drone){
        return true;
    }
}
