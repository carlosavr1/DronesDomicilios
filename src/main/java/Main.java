import Adapter.FileFacade;
import Drone.*;
import Report.*;
import Util.Instruction;

import java.util.List;

public class Main {
    public static void main(String args[]){
        FileFacade fileFacade = new FileFacade("D:\\tmp\\S4N\\Test\\", "in.txt", "D:\\tmp\\S4N\\Test\\", "out.txt");
        List<String> orders = fileFacade.readOrders();

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
            System.out.println(drone.getPosition().toString());
            Delivery delivery = new Delivery(drone.getPosition().toString());
            report.getReport().add(delivery);
        }
        fileFacade.writeReport(report.getReport());
    }
}
