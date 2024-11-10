import java.util.ArrayList;
import java.util.Scanner;

class Libros {
    private static ArrayList<Libro> libros = new ArrayList<>();

    public static void CrearLibro(Scanner sc) {
        System.out.println("Ingrese el Codigo del Libro.");
        int Codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el Nombre del Libro.");
        String Nombre = sc.nextLine();
        System.out.println("Ingrese el Autor del Libro.");
        String Autor = sc.nextLine();
        System.out.println("Ingrese el Genero.");
        String Genero = sc.nextLine();
        Libro NuevoLibro = new Libro(Codigo, Nombre, Autor, Genero);
        libros.add(NuevoLibro);
        System.out.println("EL Libro ha sido Agregado con Exito");

    }

    public static void ActualizarLibro(Scanner sc) {
        System.out.println("Ingrese el Codigo a Buscar.");
        int Codigo = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo() == Codigo) {
                System.out.println("Ingrese el Nombre del Libro.");
                String Nombre = sc.nextLine();
                System.out.println("Ingrese el Autor del Libro.");
                String Autor = sc.nextLine();
                System.out.println("Ingrese el Genero.");
                String Genero = sc.nextLine();
                System.out.println("Ingrese la Disponibildad.");
                Boolean Disponibilidad = sc.nextBoolean();
                libros.get(i).setNombre(Nombre);
                libros.get(i).setAutor(Autor);
                libros.get(i).setGenero(Genero);
                libros.get(i).setDisponibilidad(Disponibilidad);
                System.out.println("Libro Actualizado");
            } else {
                System.out.println("Libro No Encontrado");
            }
        }
    }

    public static void EliminarLibro(Scanner sc) {
        System.out.println("Ingrese el Codigo a Buscar.");
        int Codigo = sc.nextInt();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo() == Codigo) {
                libros.remove(i).getCodigo();
                System.out.println("El libro se ha eliminado");
            } else {
                System.out.println("Libro No Encontrado");
            }
        }

    }

    public static void ImprimirLibro() {
        if (libros.size() == 0) {
            System.out.println("Por el Momento no hay libros Disponibles");
        } else {
            System.out.println("--Lista de Libros--");
            for (int i = 0; i < libros.size(); i++) {
                System.out.println("Codigo del Libro: " + libros.get(i).getCodigo() + ", Titulo del Libro: " + libros.get(i).getNombre() + ", Autor: " + libros.get(i).getAutor() + ", Genero: " + libros.get(i).getGenero() + ", Disponibilidad: " + libros.get(i).getDisponibilidad());
            }
        }

    }

    public static Libro BuscarLibro(int codigoLibro) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Codigo del libro a buscar.");
        int Codigo = sc.nextInt();
        for (Libro libro : libros) {
            if (libro.getCodigo() == Codigo) {
                return libro;
            }
        }
        System.out.println("Libro no encontrado.");
        return null; // Retorna null si el socio no existe
    }
}


