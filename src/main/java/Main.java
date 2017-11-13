/**
 * Created by carlvarn on 12/11/2017.
 */
import Thread.*;

import java.util.List;

public class Main {
    public static void main(String args[]){
        for (int i = 1; i <= 3; i++) {
            Thread threadDrone = new Thread(new ThreadDrone(), String.valueOf(i));
            threadDrone.start();
        }
    }
}
