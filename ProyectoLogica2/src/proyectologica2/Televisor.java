package proyectologica2;

//Atributos
public class Televisor extends Producto {
    private String tamano;
    private String tipo;
    private String so;

    //Constructores parametrizado y por defecto
    public Televisor() {
    }

    public Televisor(String tamano, String tipo, String so, String codigo, String referencia, String marca, String color, String resolucion, int precio) {
        super(codigo, referencia, marca, color, resolucion, precio);
        this.tamano = tamano;
        this.tipo = tipo;
        this.so = so;
    }
}