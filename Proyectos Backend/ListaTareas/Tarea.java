
public class Tarea{
    private int id;
    private String Nombre;
    private String Descripcion;
    private String Categoria;
    private boolean Completado;
    

    public Tarea(int id, String nombre, String descripcion, String categoria, boolean completado) {
        this.id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Categoria = categoria;
        Completado = completado;
    }
    @Override
    public String toString(){
        return "ID: " + id + "\nNombre: " + Nombre + "\nDescripcion: " + Descripcion + "\nCategoria: " + Categoria + "\nEstado de la Tarea: " + Completado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public boolean isCompletado() {
        return Completado;
    }

    public void setCompletado(boolean completado) {
        Completado = completado;
    }

    

}