package proyectologica2;

public abstract class Producto {
    
    //Atributos
    protected String codigo;
    protected String referencia;
    protected String marca;
    protected String color;
    protected String resolucion;
    protected int precio;
    protected int cantidadispo;
    
    //Constructores parametrizado y por defecto
    
    public Producto() {
    }

    public Producto(String codigo, String referencia, String marca, String color, String resolucion, int precio) {
        this.codigo = codigo;
        this.referencia = referencia;
        this.marca = marca;
        this.color = color;
        this.resolucion = resolucion;
        this.precio = precio;
        this.cantidadispo = cantidadispo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
    //metodo para saber si el producto es un proyector
    public boolean isProyector(Producto p){
        boolean b;
        if (p instanceof Proyector){
            b=true;
        }else{
            b=false;
        }
        return b;
    }
    //metodo para saber si el producto es un televisor
    public boolean isTelevisor(Producto p){
        boolean b;
        if (p instanceof Proyector){
            b=false;
        }else{
            b=true;
        }
        return b;
    }
    
    
}