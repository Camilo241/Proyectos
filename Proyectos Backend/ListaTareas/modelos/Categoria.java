

public class Categoria {
    private int ID; 
    private String Nombre;

    public Categoria(int id,String nombre) {
        ID = id;
        Nombre = nombre;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        ID = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
}
