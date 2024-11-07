public class Socio {
    private int Identificacion,librosPrestados;

    private String Nombre,Direccion;


    public void SolicitarLibro(){

    }

    public Socio(int identificacion, int librosPrestados, String nombre, String direccion) {
        Identificacion = identificacion;
        this.librosPrestados = librosPrestados;
        Nombre = nombre;
        Direccion = direccion;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio{" + "Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Libros Prestados="
                + librosPrestados +'}';
    }
}
