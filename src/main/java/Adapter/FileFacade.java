package Adapter;

import File.File;
import Report.Delivery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class FileFacade {
    FileAdapter fileAdapter = null;
    File fileIn = null;
    File fileOut = null;
    public FileFacade(String pathFileIn, String fileNameIn, String pathFileOut, String fileNameOut){
        fileIn = new File(fileNameIn, pathFileIn);
        fileOut = new File(fileNameOut, pathFileOut);
        fileAdapter = new FileAdapter();
    }

    public List<String> readOrders(){
        List<String> orders = fileAdapter.readOrders(fileIn);
        return orders;
    }

    public void writeReport(List<Delivery> report){
        fileAdapter.writeReport(fileOut, report);
    }
}
