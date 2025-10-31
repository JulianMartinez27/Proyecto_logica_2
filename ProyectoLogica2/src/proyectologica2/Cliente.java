package proyectologica2;

//Atributos
public class Cliente {
    private String ID;
    private String nombre;
    private String fechaNacimiento;
    
    //Constructor
    public Cliente(String ID, String nombre, String fechanaci) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechanacimiento() {
        return fechaNacimiento;
    }

    public String getID() {
        return ID;
    }
    
    
    
}