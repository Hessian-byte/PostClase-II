package modelo;

import java.util.ArrayList;

public class Order {
    private String nombre;
    private int totalPrice;
    private ArrayList<OrderItem> orderItems;


    public Order(String nombre,ArrayList<OrderItem> orderItems) {
        this.nombre = nombre;
        this.orderItems = orderItems;
        this.totalPrice = calcularTotalPrice();
    }

    public Order(String nombre) {
        this.nombre = nombre;
        this.totalPrice = 0;
        this.orderItems = new ArrayList<>();
    }

    private int calcularTotalPrice(){
        int a = 0;
        for (OrderItem oi:orderItems) {
            a += oi.getPrice();
        }
        return a;
    }

    public void addItem(MenuItem item){
        OrderItem oi = new OrderItem(item,1);
        orderItems.add(oi);

    }
    public void addItem(MenuItem item, int quantity){
        OrderItem oi = new OrderItem(item,quantity);
        orderItems.add(oi);
    }
    public void deleteItem(MenuItem item){

        for (int i = 0; i < orderItems.size(); i++){
            if (orderItems.get(i).getMenuItem() == item){
                orderItems.remove(i);
                return;
            }
        }

    }

    public int getTotalPrice() {
        totalPrice = calcularTotalPrice();
        return totalPrice;
    }


    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Object[] getArrayObject(){
        Object[] array = {nombre,totalPrice,""};
        return array;
    }

    public String getNombre() {
        return nombre;
    }
}
