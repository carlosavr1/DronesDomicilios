package Adapter;

import Report.Delivery;

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class FileAdapter {

    public List<String> readOrder(String fileName){
        List<String> orders = new ArrayList<String>();
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                orders.add(sCurrentLine);
            }
            return orders;

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
            return orders;

        }
    }

    public void writeReport(String fileName, List<Delivery> report){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = "This is the content to write into file\n";

            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            for (Delivery delivery: report
                 ) {
                bw.write(delivery.getDeliveryPosition()+"\n");
            }


            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

}
