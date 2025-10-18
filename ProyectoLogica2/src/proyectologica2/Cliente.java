package proyectologica2;

//Atributos
public class Cliente {
    private String ID;
    private String nombre;
    private String fechanaci;
    
    //Constructores parametrizado y por defecto

    public Cliente() {
    }
    
    public Cliente(String ID, String nombre, String fechan) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechanaci = fechanaci;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public String getID() {
        return ID;
    }
    
    
    
}