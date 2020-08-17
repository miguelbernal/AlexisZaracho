package facturacion;

public class Detalle {
    private Producto producto;
    private int cantidad;
    private int precio;

    public Detalle() {
    }

    public Detalle(Producto producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Detalle{" + "producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
}
