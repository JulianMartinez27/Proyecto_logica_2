package proyectologica2;
import java.util.*;
//TENER EN CUENTA, ESTE CONTROLADOR ES EL UNICO QUE DEBE HABER, ES QUIEN VA A MANEJAR TODOS LOS CLIENTES, TODAS LAS COMPRAS, TODOS LOS PRODUCTOS ETC EN SUS ARRAYLIST, CUANDO SE NECESITE LA INFORMACION DE ESOS OBJETOS, LLAMAR A ESTE CONTROLADOR.
public class Controlador {
    
    //ArrayList que contendra todos los productos
    private ArrayList<Producto> productos=new ArrayList<>();
    //ArraylList que Contendra todos los clientes
    private ArrayList<Cliente> clientes=new ArrayList<>();
    //ArrayList que contendra todas las compras
    private ArrayList<Compra> compras=new ArrayList<>();
    
    
    
    //METODOS
    //Metodo para guardar productos en el arraylist
    public void guardarproducto(Producto p){
        productos.add(p);
    }
    //Metodo para guardar clientes en el arraylist
    public void guardarclientes(Cliente c){
        clientes.add(c);
    }
    //Metodo para guardar compras en el arraylist
    public void guardarcompras(Compra co){
        compras.add(co);
    }
    
    //Metodo para buscar un producto por su codigo, devuelve el objeto producto
    
    public Producto buscarproducto(String c){
        for (int i = 0; i < productos.size(); i++) {
            if(c.equalsIgnoreCase(productos.get(i).getCodigo()))
                return productos.get(i);
        }
        return null;
    }
    //Metodo para buscar un cliente por su documento, devuelve el objeto cliente
    public Cliente buscarcliente(String id){
        Cliente c=null;
        for (int i = 0; i < clientes.size(); i++) {
            if(id.equalsIgnoreCase(clientes.get(i).getID()))
                c=clientes.get(i);
        }
        return c;
    }

    //Metodo para devolver la cantidad de televisores registrados, devuelve entero
    public int cantidadtele(){
        int cant=0;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i) instanceof Televisor)
                cant+=1;
        }
        return cant;
    }
    
    //Metodo para devolver la cantidad de proyectores registrados, devuelve entero
    public int cantidadproye(){
        int cant=0;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i) instanceof Proyector)
                cant+=1;
        }
        return cant;
    }
    
    //Metodo para saber cuantos productos hay en la tienda
    public int CantidadProductos(){
        int cant=productos.size();
        return cant;
    }

    //Metodo para saber cuantos productos marca samsung hay
    public int cantidadsam(){
        int cant=0;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getMarca().equalsIgnoreCase("Samsung"))
                cant+=1;
        }
        return cant;
    }
    
    //Metodo para obtener promedio de precio de productos marca samsung
    public double PromedioPrecioSamsung(){
        int cant=cantidadsam();
        int preciototal=0;
        double prom;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getMarca().equalsIgnoreCase("Samsung"))
                preciototal+=productos.get(i).getPrecio(); 
        }
        prom=preciototal/cant;
        return prom;
    }
    

}