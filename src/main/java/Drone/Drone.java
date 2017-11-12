package Drone;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class Drone extends DroneEventsProcessing{
    private Position position;

    public Drone() {
        position = new NorthPosition(0,0);
    }

    @Override
    public void event(char eventName){
        if(validateTurnLeft(eventName)){
            turnLeft(this);
        }else if(validateTurnRight(eventName)){
            turnRight(this);
        }else{
            this.position.move();
        }
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position position){
        this.position = position;
    }
}
