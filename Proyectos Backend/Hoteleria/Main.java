package Hoteleria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Habitaciones> listaHabitaciones = new ArrayList<>();
        int idCounter = 1;
        int opcion = 0;
        do {
            System.out.println(
                    "Seleccione una opción: \n 1. Crear Habitación\n 2. Actualizar Habitación\n 3. Eliminar Habitación\n 4. Ver Habitaciones\n 5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Nombre de la Habitación:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la Descripción de la Habitación:");
                    String descripcion = sc.nextLine();
                    System.out.println("Ingrese el precio de la Habitación:");
                    int precio = sc.nextInt();
                    sc.nextLine();

                    Habitaciones nuevaHabitacion = new Habitaciones(idCounter++, nombre, descripcion, precio, true);
                    listaHabitaciones.add(nuevaHabitacion);
                    break;

                case 2:
                    System.out.println("Ingrese el ID de la habitación a actualizar:");
                    int idActualizar = sc.nextInt();
                    sc.nextLine(); // Consumir salto de línea
                    Habitaciones habitacion = Habitaciones.buscarHabitacionPorId(idActualizar, listaHabitaciones);
                    if (habitacion != null) {
                        System.out.println("Ingrese el nuevo nombre (dejar vacío para no cambiar):");
                        String nuevoNombre = sc.nextLine();
                        if (!nuevoNombre.isEmpty()) {
                            habitacion.setNombre(nuevoNombre);
                        }

                        System.out.println("Ingrese el nuevo precio (0 para no cambiar):");
                        int nuevoPrecio = sc.nextInt();
                        if (nuevoPrecio > 0) {
                            habitacion.setPrecio(nuevoPrecio);
                        }
                        System.out.println("Habitación actualizada.");
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el ID de la habitación a Eliminar:");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Eliminar Habitación seleccionada.");
                    Habitaciones.EliminarHabitaciones(idEliminar, listaHabitaciones);
                    break;

                case 4:
                    System.out.println("Ver todas las Habitaciones.");
                    Habitaciones.VerHabitraciones(listaHabitaciones);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
            if (opcion != 5) {
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine();
            }
        } while (opcion != 5);

        sc.close();
    }

}
