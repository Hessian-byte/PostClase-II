package modelo;

public class MenuItem {
    private String productName;
    private int precioUnitario;
    private String codigo;

    public MenuItem(String productName, int precioUnitario, String codigo) {
        this.productName = productName;
        this.precioUnitario = precioUnitario;
        this.codigo = codigo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Object[] getArrayObject(){
        Object[] array = {productName,precioUnitario,codigo};
        return array;
    }
}
