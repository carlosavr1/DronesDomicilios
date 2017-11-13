package Thread;

import Adapter.FileFacade;
import Drone.Drone;
import Drone.DroneController;
import Report.*;
import Util.Instruction;

import java.util.List;

/**
 * Created by carlvarn on 13/11/2017.
 */
public class ThreadDrone implements Runnable {

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("ARRANCÓ EL DRON "+name);
        String fileNameIn = "in"+name+".txt";
        String fileNameOut = "out"+name+".txt";
        try {
            FileFacade fileFacade = new FileFacade("D:\\tmp\\S4N\\Test\\", fileNameIn, "D:\\tmp\\S4N\\Test\\", fileNameOut);
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("TERMINÓ EL DRON "+Thread.currentThread().getName());
    }

}
