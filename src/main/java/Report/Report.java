package Report;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class Report {
    private List<Delivery> report;

    public Report(){
        report = new ArrayList<Delivery>();
    }

    public List<Delivery> getReport(){
        return report;
    }
}
