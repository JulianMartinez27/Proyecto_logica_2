package proyectologica2;
import java.util.*;
//TENER EN CUENTA, ESTE CONTROLADOR ES EL UNICO QUE DEBE HABER, ES QUIEN VA A MANEJAR TODOS LOS CLIENTES, TODAS LAS COMPRAS, TODOS LOS PRODUCTOS ETC EN SUS ARRAYLIST, CUANDO SE NECESITE LA INFORMACION DE ESOS OBJETOS, LLAMAR A ESTE CONTROLADOR.
public class Controlador {

    
    //ArrayList que contendra todos los productos
    private ArrayList<Producto> arregloProductos;
    //ArraylList que Contendra todos los clientes
    private ArrayList<Cliente> arregloClientes;
    //ArrayList que contendra todas las compras
    private ArrayList<Compra> arregloCompras;
    //Controlador
    public Controlador() {
        arregloProductos=new ArrayList();
        arregloClientes=new ArrayList();
        arregloCompras=new ArrayList();
    }
    //METODOS
    //Metodo para guardar productos en el arraylist
    public void guardarProducto(Producto p){
        arregloProductos.add(p);
    }
    //Metodo para guardar clientes en el arraylist
    public void guardarClientes(Cliente c){
        arregloClientes.add(c);
    }
    //Metodo para guardar compras en el arraylist
    public void guardarCompras(Compra co){
        arregloCompras.add(co);
    }
    //Metodo get de los arraylist
    public ArrayList<Producto> getArregloProductos() {
        return arregloProductos;
    }

    public ArrayList<Cliente> getArregloClientes() {
        return arregloClientes;
    }
    //Metodo para buscar un producto por su codigo, devuelve el objeto producto
    
    public Producto buscarProducto(String c){
        for (int i = 0; i < arregloProductos.size(); i++) {
            if(c.equalsIgnoreCase(arregloProductos.get(i).getCodigo()))
                return arregloProductos.get(i);
        }
        return null;
    }
    //Metodo para buscar un cliente por su documento, devuelve el objeto cliente
    public Cliente buscarCliente(String id){
        for (int i = 0; i < arregloClientes.size(); i++) {
            if(id.equalsIgnoreCase(arregloClientes.get(i).getID()))
                return arregloClientes.get(i);
        }
        return null;
    }

    //Metodo para devolver la cantidad de televisores registrados, devuelve entero
    public int cantidadTelevisores(){
        int cant=0;
        for (int i = 0; i < arregloProductos.size(); i++) {
            if(arregloProductos.get(i) instanceof Televisor)
                cant+=1;
        }
        return cant;
    }
    
    //Metodo para devolver la cantidad de proyectores registrados, devuelve entero
    public int cantidadProyectores(){
        int cant=0;
        for (int i = 0; i < arregloProductos.size(); i++) {
            if(arregloProductos.get(i) instanceof Proyector)
                cant+=1;
        }
        return cant;
    }


    //Metodo para saber cuantos productos marca samsung hay
    public int cantidadSamsung(){
        int cant=0;
        for (int i = 0; i < arregloProductos.size(); i++) {
            if(arregloProductos.get(i).getMarca().equalsIgnoreCase("Samsung"))
                cant+=1;
        }
        return cant;
    }
    
    //Metodo para obtener promedio de precio de productos marca samsung
    public double PromedioPrecioSamsung(){
        int cant=cantidadSamsung();
        int preciototal=0;
        double prom;
        for (int i = 0; i < arregloProductos.size(); i++) {
            if(arregloProductos.get(i).getMarca().equalsIgnoreCase("Samsung"))
                preciototal+=arregloProductos.get(i).getPrecio(); 
        }
        prom=preciototal/cant;
        return prom;
    }
   
    public int restaUnidades(int n, String codigo){
        Producto p=buscarProducto(codigo);
        return p.getCantidadDisponible()-n;
    }
    
    public void actualizarUnidades(String codigo, int n){
        Producto p=buscarProducto(codigo);
        p.setCantidadDisponible(restaUnidades(n,codigo));
    }
    
    
    

}