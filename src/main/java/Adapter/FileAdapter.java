package Adapter;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

}
