package proyectologica2;
import java.util.*;
//Atributos
public class Compra {
    private String fecha;
    private Cliente cliente;
    private HashMap<String,Integer>productosComprados; //Este hashmap contiene el codigo del producto y la cantidad que el cliente va a comprar
    private int total;
    private double totalpagar;

    //Constructor
    public Compra(String fecha, Cliente cliente, HashMap<String, Integer> productosComprados, int total, double totalpagar) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productosComprados = productosComprados;
        this.total = total;
        this.totalpagar = totalpagar;
    }


    
    

    
    
    
}
