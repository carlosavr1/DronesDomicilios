/**
 * Created by carlvarn on 12/11/2017.
 */
import Adapter.FileAdapter;
import Drone.*;
import Report.*;
import Util.Instruction;

import java.util.List;

public class Main {
    public static void main(String args[]){
        FileAdapter fileAdapter = new FileAdapter();
        List<String> orders = fileAdapter.readOrder("D:\\tmp\\S4N\\Test\\in.txt");
        DroneController droneController = new DroneController();
        Drone drone = droneController.createDrone();
        Report report = new Report();
        for (String order: orders
             ) {
            System.out.println(order);
            char []instructions = order.toCharArray();
            for (char instruction: instructions
                    ) {
                droneController.executeInstruction(drone, new Instruction(instruction));
            }
            drone.getPosition().printPosition();
            Delivery delivery = new Delivery(drone.getPosition().position());
            report.getReport().add(delivery);
        }
        fileAdapter.writeReport("D:\\tmp\\S4N\\Test\\out.txt", report.getReport());
    }
}
