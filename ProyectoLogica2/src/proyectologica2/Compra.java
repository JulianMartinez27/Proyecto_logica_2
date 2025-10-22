package proyectologica2;
import java.util.*;
//Atributos
public class Compra {
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto>productos;
    private int cantidadtele;
    private int cantidadproye;
    private int total;
    private double totalpagar;

    public Compra() {
    }

    public Compra(String fecha, Cliente cliente, ArrayList<Producto> productos, int cantidadtele, int cantidadproye, int total, double totalpagar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.cantidadtele = cantidadtele;
        this.cantidadproye = cantidadproye;
        this.total = total;
        this.totalpagar = totalpagar;
    }
    
    

    
    
    
}
