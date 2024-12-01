package Hoteleria;
import java.util.ArrayList;


public class Habitaciones {

    int Id, Precio;
    String Nombre,Descripcion;
    boolean disponibilidad = true;
    
    public static void EliminarHabitaciones(int Id,ArrayList<Habitaciones> Habitacion){
        Habitacion.removeIf(H-> H.getId() == Id);
    }
    public static void  VerHabitraciones(ArrayList<Habitaciones> Habitacion){
        for (Habitaciones habitaciones : Habitacion) {
            System.out.println("ID: " + habitaciones.getId() + ", Nombre: " + habitaciones.getNombre() +
            ", Precio: " + habitaciones.getPrecio() + ", Disponible: " + habitaciones.isDisponibilidad());
        }
    }
    public static Habitaciones buscarHabitacionPorId(int Id,ArrayList<Habitaciones> Habitacion){
        for (Habitaciones habitaciones : Habitacion) {
            if (habitaciones.getId() == Id) {
                return habitaciones;
            }
        }
        return null;
    }
    public Habitaciones(int id,String nombre, String descripcion,int precio,boolean disponibilidad) {
        Id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
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
    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


}
