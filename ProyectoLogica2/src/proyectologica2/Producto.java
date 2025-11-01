package proyectologica2;

public abstract class Producto {
    
    //Atributos
    protected String codigo;
    protected String referencia;
    protected String marca;
    protected String color;
    protected String resolucion;
    protected int precio;
    protected int cantidadDisponible;
    
    //Constructores parametrizado y por defecto
    
    public Producto() {
    }

    public Producto(String codigo, String referencia, String marca, String color, String resolucion, int precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.referencia = referencia;
        this.marca = marca;
        this.color = color;
        this.resolucion = resolucion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto: \n codigo: " + codigo + ", referencia: " + referencia + ", marca: " + marca + ", color: " + color + ", resolucion: " + resolucion + ", precio: " + precio + ", cantidadDisponible: " + cantidadDisponible;
        
    }
    
    

    public int getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getResolucion() {
        return resolucion;
    }
    
    
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
      

    
}