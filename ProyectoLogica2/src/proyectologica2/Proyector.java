package proyectologica2;

//Atributos
public class Proyector extends Producto {
    
    private String tipou;
    private String tecnovi;

    public Proyector() {
    }
    
    public Proyector(String tipou, String tecnovi, String codigo, String referencia, String marca, String color, String resolucion, int precio) {
        super(codigo, referencia, marca, color, resolucion, precio);
        this.tipou = tipou;
        this.tecnovi = tecnovi;
    }

    
    
    
    
}
