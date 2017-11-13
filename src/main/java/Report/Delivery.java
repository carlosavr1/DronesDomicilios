package Report;

import Util.Position;

/**
 * Created by carlvarn on 12/11/2017.
 */
public class Delivery {
    private String deliveryPosition;

    public Delivery(String deliveryPosition){
        this.deliveryPosition = deliveryPosition;
    }

    public String getDeliveryPosition(){
        return deliveryPosition;
    }
}
