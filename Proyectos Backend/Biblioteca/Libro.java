public class Libro {
    private int Codigo;

    private String Nombre,Autor,Genero;

    private Boolean Disponibilidad = true;
    
    public Libro(int codigo, String nombre, String autor, String genero) {
        Codigo = codigo;
        Nombre = nombre;
        Autor = autor;
        Genero = genero;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Boolean getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro {" + "Codigo= " + Codigo + ", Titulo= " + Nombre + ", Autor= " + Autor + ", Genero= " + Genero + ", Disponibilidad= " + Disponibilidad + '}';
    }
}