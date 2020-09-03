package modelo;

import java.util.ArrayList;

public class Order {
    private int totalPrice;
    private ArrayList<OrderItem> orderItems;
    private MenuItem chosenMenu;

    protected void addItem(MenuItem item){
        OrderItem oi = new OrderItem(item,1);
        orderItems.add(oi);

    }
    protected void addItem(MenuItem item, int quantity){
        OrderItem oi = new OrderItem(item,quantity);
        orderItems.add(oi);
    }
    protected void deleteItem(MenuItem item){

        for (int i = 0; i < orderItems.size(); i++){
            if (orderItems.get(i).getMenuItem() == item){
                orderItems.remove(i);
                return;
            }
        }

    }

    public int getTotalPrice() {
        for (OrderItem oi:orderItems) {
            totalPrice += oi.getPrice();
        }
        return totalPrice;
    }


    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public MenuItem getChosenMenu() {
        return chosenMenu;
    }

    public void setChosenMenu(MenuItem chosenMenu) {
        this.chosenMenu = chosenMenu;
    }
}
