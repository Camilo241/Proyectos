

public class Categoria {
    private int Id; 
    private String Nombre;
    
    public Categoria(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
}
