package cursojava;

public class Cliente {
    // atributos o variables
    // Encapsulacion
    private int id_cliente;
    private String nombre_cliente;
    private boolean credito_cliente;
    private float descuento_cliente;

    // Metodos
    // Constructor sin parametros
    public Cliente(){
        System.out.println("Creando un nuevo cliente");
    }
    // Constructor con parametros
    public Cliente(int id_cliente, String nombre_cliente, boolean credito_cliente, float descuento_cliente){
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.credito_cliente = credito_cliente;
        this.descuento_cliente = descuento_cliente;
    }
    // Metodos get (recuperar datos) y set (modificar datos)
    // Id cliente
    public int getId_cliente(){
        return this.id_cliente;
    }
    
    public void setId_cliente(int id_cliente){
        this.id_cliente = id_cliente;
    }
    // Nombre cliente
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    // Credito cliente
    public boolean isCredito_cliente() {
        return credito_cliente;
    }

    public void setCredito_cliente(boolean credito_cliente) {
        this.credito_cliente = credito_cliente;
    }
    // Descuento cliente
    public float getDescuento_cliente() {
        return descuento_cliente;
    }

    public void setDescuento_cliente(float descuento_cliente) {
        this.descuento_cliente = descuento_cliente;
    }

    // Polimorfismo
    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", credito_cliente=" + credito_cliente + ", descuento_cliente=" + descuento_cliente + '}';
    }
    
}