package facturacion;

import java.util.ArrayList;
import java.util.Date;

public class Facturacion {

    private static ArrayList<Factura> facturas = new ArrayList<>();
    private static ArrayList<Producto> productos = new ArrayList<>();
    
    public static void main(String[] args) {
        // Carga de Productos
        Producto producto1 = new Producto();
        producto1.setCodigo("a01");
        producto1.setNombre("Jugo");
        producto1.setPrecio(12500);
        productos.add(producto1);
        Producto producto2 = new Producto();
        producto2.setCodigo("a02");
        producto2.setNombre("Galletita");
        producto2.setPrecio(5500);
        productos.add(producto2);
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        // Carga de Facturas
        Factura factura = new Factura();
        factura.setId(1);
        factura.setFecha(new Date());
        factura.setNombreCliente("Juan Perez");
        // Carga de detalles
        ArrayList<Detalle> detalles = new ArrayList<>();
        Detalle detalle1 = new Detalle();
        detalle1.setProducto(producto1);
        detalle1.setCantidad(3);
        detalle1.setPrecio(12700);
        detalles.add(detalle1);
        
        Detalle detalle2 = new Detalle();
        detalle2.setProducto(producto2);
        detalle2.setCantidad(5);
        detalle2.setPrecio(5700);
        detalles.add(detalle2);
        
        factura.setDetalles(detalles);
        
        facturas.add(factura);
        
        for (Factura facturaActual : facturas) {
            System.out.println(facturaActual);
        }
              
        for (Factura facturaActual : facturas) {
            System.out.println("------------------");
            System.out.println(facturaActual.getId());
            System.out.println(facturaActual.getFecha());
            System.out.println(facturaActual.getNombreCliente());
            int total = 0;
            for (Detalle detalle : facturaActual.getDetalles()) {
                System.out.println(detalle.getProducto().getCodigo() + " - " +
                                   detalle.getProducto().getNombre() + " - " +
                                   detalle.getCantidad() + " - " +
                                   detalle.getPrecio() + " - " +
                                   (detalle.getCantidad() * detalle.getPrecio()) 
                                    );
                total += detalle.getCantidad() * detalle.getPrecio();
            }
            System.out.println("Total Factura: " + total);
        }
        
    }
    
}
