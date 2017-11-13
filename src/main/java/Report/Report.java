package Report;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Delivery> report;

    public Report(){
        report = new ArrayList<Delivery>();
    }

    public List<Delivery> getReport(){
        return report;
    }
}
