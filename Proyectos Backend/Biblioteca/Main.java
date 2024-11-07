import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Registrar socio\n2. Registrar libro\n3. Registrar prestamo\n4. Ver socios\n5. Ver libros\n6. Ver prestamos\n7. Ver socios no fiables\n8. Salir\nElige:");
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
