package proyectologica2;

//Atributos
public class Televisor extends Producto {
    private String tamano;
    private String tipo;
    private String so;

    //Constructores parametrizado y por defecto
    public Televisor() {
    }

    public Televisor(String tamano, String tipo, String so, String codigo, String referencia, String marca, String color, String resolucion, int precio, int cantidadDisponible) {
        super(codigo, referencia, marca, color, resolucion, precio,cantidadDisponible);
        this.tamano = tamano;
        this.tipo = tipo;
        this.so = so;
    }

    @Override
    public String toString() {
        return super.toString()+", Tipo: Televisor, tamaño: " + tamano + ", tipo=" + tipo + ", sistema operativo: " + so;
    }
    
    
}