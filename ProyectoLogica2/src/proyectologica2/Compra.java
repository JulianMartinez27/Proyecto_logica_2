package proyectologica2;
import java.util.*;
//Atributos
public class Compra {
    private String fecha;
    private Cliente cliente;
    private Producto producto;
    private int cantidadtele;
    private int cantidadproye;
    private int total;
    private int totalpagar;
    private ArrayList<Producto>productos;

    public Compra() {
    }

    public Compra(String fecha, Cliente cliente, Producto producto, int cantidadtele, int cantidadproye, int total, int totalpagar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadtele = cantidadtele;
        this.cantidadproye = cantidadproye;
        this.total = total;
        this.totalpagar = totalpagar;
    }
    
    public void guardarproductosencompra(){
        
    }
    
    
}
