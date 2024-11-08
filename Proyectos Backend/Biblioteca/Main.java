import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("¿Qué desea hacer?");
            System.out.println(
                    "1. Registrar socio\n2. Registrar libro\n3. Registrar prestamo\n4. Ver socios\n5. Ver libros\n6. Ver prestamos\n7. Ver socios no fiables\n8. Actualizar Socio\n9. Actualizar Libro\n10. Actualizar Prestamo\n11. Eliminar Socio\n12. Eliminar Libro\n13. Eliminar Prestamo\n14. Salir \nElige:");
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
                    break;
                case 4:
                    Socios.ImprimirSocios();
                    break;
                case 5:
                    Libros.ImprimirLibro();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    Socios.ActualizarSocio(sc);
                    break;
                case 9:
                    Libros.ActualizarLibro(sc);
                    break;
                case 10:
                    break;
                case 11:
                    Socios.EliminarSocio(sc);
                    break;
                case 12:
                    Libros.EliminarLibro(sc);
                    break;
                case 13:
                    Socios.ActualizarSocio(sc);
                    break;
                case 14:
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
