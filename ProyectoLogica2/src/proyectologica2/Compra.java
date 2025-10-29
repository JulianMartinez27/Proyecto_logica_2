package proyectologica2;
import java.util.*;
//Atributos
public class Compra {
    private String fecha;
    private Cliente cliente;
    private HashMap<>productos;
    private int cantidad;
    private int total;
    private double totalpagar;

    public Compra() {
    }

    public Compra(String fecha, Cliente cliente, ArrayList<Producto> productos, int cantidad, int total, double totalpagar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.cantidad=cantidad;
        this.total = total;
        this.totalpagar = totalpagar;
    }
    
    

    
    
    
}
