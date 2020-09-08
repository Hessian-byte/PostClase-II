package modelo;

import java.util.ArrayList;

public class PhoneOrder extends Order{
    private String callbackNumber;

    public PhoneOrder(String nombre,ArrayList<OrderItem> orderItems, String callbackNumber) {
        super(nombre,orderItems);
        this.callbackNumber = callbackNumber;
    }

    public String getCallbackNumber() {
        return callbackNumber;
    }

    public void setCallbackNumber(String callbackNumber) {
        this.callbackNumber = callbackNumber;
    }

    public Object[] getArrayObject(){
        Object[] array = {super.getNombre(),super.getTotalPrice(),callbackNumber};
        return array;
    }
}
