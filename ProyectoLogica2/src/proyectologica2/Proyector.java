package proyectologica2;

//Atributos
public class Proyector extends Producto {
    
    private String tipou;
    private String tecnovi;

    public Proyector() {
    }
    
    public Proyector(String tipou, String tecnovi, String codigo, String referencia, String marca, String color, String resolucion, int precio, int cantidadDisponible) {
        super(codigo, referencia, marca, color, resolucion, precio,cantidadDisponible);
        this.tipou = tipou;
        this.tecnovi = tecnovi;
    }

    @Override
    public String toString() {
        return super.toString()+", Tipo: Proyector" + "tipo de uso: " + tipou + ", tecnologia de visualizacion: " + tecnovi;
    }

    
    
    
    
}
