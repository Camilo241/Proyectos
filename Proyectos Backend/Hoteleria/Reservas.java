package Hoteleria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservas {
    int ID;
    String Nombre;
    Habitaciones Habitaciones;
    LocalDate FechaInicio,FechaFinal;

    static void EliminarReservaHabitacion(int ID,ArrayList <Reservas> listaReservasiones){
        listaReservasiones.remove(ID);
    }
    static void VerReservaHabitacion(ArrayList <Reservas> listaReservasiones){
        for (Reservas reservas : listaReservasiones) {
            System.out.println("ID: " + reservas.getID() + "\nNombre de la persona que reservo: " + reservas.getNombre() + "\nFecha de Entrada: " + reservas.getFechaInicio() + "\nFecha de Salida: " + reservas.getFechaFinal());
        }
    }


    public Reservas(int iD, String nombre,Habitaciones habitaciones, LocalDate fechaInicio, LocalDate fechaFinal) {
        ID = iD;
        Nombre = nombre;
        Habitaciones = habitaciones;
        FechaInicio = fechaInicio;
        FechaFinal = fechaFinal;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Habitaciones getHabitaciones() {
        return Habitaciones;
    }
    public LocalDate getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }
    public LocalDate getFechaFinal() {
        return FechaFinal;
    }
    public void setFechaFinal(LocalDate fechaFinal) {
        FechaFinal = fechaFinal;
    }
    
    

}
