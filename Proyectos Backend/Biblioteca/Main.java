import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 13) {
            System.out.println("¿Qué desea hacer?");
            System.out.println(
                    "1. Registrar socio\n2. Registrar libro\n3. Registrar prestamo\n4. Ver socios\n5. Ver libros\n6. Ver prestamos\n7. Ver socios no fiables\n8. Actualizar Socio\n9. Actualizar Libro\n10. Eliminar Socio\n11. Eliminar Libro\n12. Eliminar Prestamo\n13. Salir \nElige:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    Socios.CrearSocio(sc);
                    break;
                case 2:
                    Libros.CrearLibro(sc);
                    break;
                case 3:
                    Prestamos.CrearPrestamo(sc);
                    break;
                case 4:
                    Socios.ImprimirSocios();
                    break;
                case 5:
                    Libros.ImprimirLibro();
                    break;
                case 6:
                    Prestamos.ImprimirPrestamos();
                    break;
                case 7:
                    Socios.ImprimirSocioNoFiable();
                    break;
                case 8:
                    Socios.ActualizarSocio(sc);
                    break;
                case 9:
                    Libros.ActualizarLibro(sc);
                    break;
                case 10:
                    Socios.EliminarSocio(sc);
                    break;
                case 11:
                    Libros.EliminarLibro(sc);
                    break;
                case 12:
                    Prestamos.EliminarPrestamo(sc);
                    break;
                case 13:
                    System.out.println("Muchas Gracias Bye.");
                    break;
                default:
                    System.out.println("Aprenda a Leer el Menu.");
                    break;
            }
        }
        sc.close();
    }

}
