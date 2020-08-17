package facturacion;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int id;
    private Date fecha;
    private String nombreCliente;
    private ArrayList<Detalle> detalles;

    public Factura() {
    }

    public Factura(int id, Date fecha, String nombreCliente, ArrayList<Detalle> detalles) {
        this.id = id;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.detalles = detalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", detalles=" + detalles + '}';
    }
    
}
