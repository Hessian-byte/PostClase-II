package modelo;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<Order> orders;

    public Menu() {
        this.menuItems = new ArrayList<MenuItem>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Object[] getArrayMenuItem(int i){
        return menuItems.get(i).getArrayObject();
    }


}
