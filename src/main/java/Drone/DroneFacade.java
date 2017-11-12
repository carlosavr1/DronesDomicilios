package Drone;

import Util.NorthPosition;
import Util.Position;
import Util.Positions;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class DroneFacade extends DroneEventsProcessing {

    public Drone createDrone(Positions initialPosition, int initialCoordinateX, int initialCoordinateY){
        Position position = createPosition(initialPosition, initialCoordinateX, initialCoordinateY);
        Drone drone = new Drone();
        drone.setPosition(position);
        return drone;
    }

    private Position createPosition(Positions initialPosition, int initialCoordinateX, int initialCoordinateY){
        Position position = null;
        if(initialPosition.equals(Positions.NORTH)) {
            position = new NorthPosition(initialCoordinateX, initialCoordinateY);
        }
        return position;
    }

    @Override
    public void event(Drone drone, char eventName){
        if(validateTurnLeft(eventName)){
            turnLeft(drone);
        }else if(validateTurnRight(eventName)){
            turnRight(drone);
        }else if(validateMove(eventName)){
            drone.setPosition(drone.getPosition().nextPosition());
        }
    }
}
