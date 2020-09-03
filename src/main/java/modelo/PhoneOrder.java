package modelo;

import java.util.ArrayList;

public class PhoneOrder extends Order{
    private String callbackNumber;

    public PhoneOrder(int totalPrice, ArrayList<OrderItem> orderItems, MenuItem chosenMenu, String callbackNumber) {
        super(totalPrice, orderItems, chosenMenu);
        this.callbackNumber = callbackNumber;
    }

    public String getCallbackNumber() {
        return callbackNumber;
    }

    public void setCallbackNumber(String callbackNumber) {
        this.callbackNumber = callbackNumber;
    }
}
