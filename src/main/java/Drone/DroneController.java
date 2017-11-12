package Drone;

import Util.Instruction;
import Util.PositionFactory;
import Util.Directions;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class DroneController extends DroneEventsProcessing {

    public Drone createDrone(){
        PositionFactory position = new PositionFactory();
        Drone drone = new Drone(position.createInitialPosition());
        return drone;
    }

    @Override
    public void executeInstruction(Drone drone, Instruction instruction){

    }

}
