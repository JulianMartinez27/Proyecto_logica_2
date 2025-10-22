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
        for (int i = 0; i < clientes.size(); i++) {
            if(id.equalsIgnoreCase(clientes.get(i).getID()))
                return clientes.get(i);
        }
        return null;
    }




}