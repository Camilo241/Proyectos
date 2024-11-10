
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Prestamos {
    private static ArrayList<Prestamo> prestamos = new ArrayList<>();

    public static void CrearPrestamo(Scanner sc) {
        System.out.println("Ingrese la Identificacion del Usuario:");
        int identificacionUsuario = sc.nextInt();
        System.out.println("Ingrese el codigo del libro a prestar:");
        int codigoLibro = sc.nextInt();

        // Buscar socio y libro
        Socio socio = Socios.BuscarSocio(identificacionUsuario);
        Libro libro = Libros.BuscarLibro(codigoLibro);
        if (socio != null && libro != null && libro.getDisponibilidad()) {

            Prestamo prestamo = new Prestamo(codigoLibro, identificacionUsuario, LocalDateTime.now() );
            // Registrar el préstamo y marcar el libro como no disponible
            prestamos.add(prestamo);
            libro.setDisponibilidad(false);
            System.out.println("Préstamo registrado con éxito.");
        } else {
            System.out.println("Préstamo no disponible. Verifique la disponibilidad del libro o la existencia del usuario.");
        }
    }

    public static void ImprimirPrestamos(){
        System.out.println("--Lista de Prestamos--");
        if (prestamos.size() == 0) {
            System.out.println("Por el Momento No se han Registrado Prestamos");
        }else{
            for (int i = 0; i < prestamos.size(); i++) {  
                System.out.println("Codigo Libro: " + prestamos.get(i).getCodigoLibro() + ", Identificacion del Socio: " + prestamos.get(i).getIdentificacionSocio() + ", Fecha del Prestamo: " + prestamos.get(i).getFechaFormateada());
            }
        }
        
    }

    public static void EliminarPrestamo(Scanner sc){
        System.out.println("Ingrese el codigo del libro a Eliminar.");
        int codigoLibro = sc.nextInt();
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getCodigoLibro() == codigoLibro) {
                prestamos.remove(i).getCodigoLibro();
                System.out.println("El prestamo ha sido Eliminado");
            } else {
                System.out.println("Prestamo No Encontrado");
            }
        }
    }

    }
