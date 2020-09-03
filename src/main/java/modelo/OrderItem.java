package modelo;

public class OrderItem {
    private MenuItem menuItem;
    private String productName;
    private int quantity;
    private int price;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.productName = menuItem.getProductName();
        this.quantity = quantity;
        this.price = quantity * menuItem.getPrecioUnitario();
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
