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
        System.out.println("Ingrese la Disponibildad.");
        Boolean Disponibilidad = sc.nextBoolean();
        Libro NuevoLibro = new Libro(Codigo, Nombre, Autor, Genero, Disponibilidad);
        libros.add(NuevoLibro);
        System.out.println("EL Libro ha sido Agregado con Exito");

    }

    public static void ActualizarLibro(Scanner sc) {
        System.out.println("Ingrese el Codigo a Buscar.");
        int Codigo = sc.nextInt();
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
                libros.get(Codigo).setNombre(Nombre);
                libros.get(Codigo).setAutor(Autor);
                libros.get(Codigo).setGenero(Genero);
                libros.get(Codigo).setDisponibilidad(Disponibilidad);
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
                System.out.println("Ingrese el Nombre del Libro.");
                String Nombre = sc.nextLine();
                System.out.println("Ingrese el Autor del Libro.");
                String Autor = sc.nextLine();
                System.out.println("Ingrese el Genero.");
                String Genero = sc.nextLine();
                System.out.println("Ingrese la Disponibildad.");
                Boolean Disponibilidad = sc.nextBoolean();
                libros.get(Codigo).setNombre(Nombre);
                libros.get(Codigo).setAutor(Autor);
                libros.get(Codigo).setGenero(Genero);
                libros.get(Codigo).setDisponibilidad(Disponibilidad);
                System.out.println("Libro Actualizado");
            } else {
                System.out.println("Libro No Encontrado");
            }
        }

    }

    public static void ImprimirLibro() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.toString());
        }
    }

    public static void BuscarLibro(Scanner sc) {
        System.out.println("Ingrese el Codigo del libro a buscar.");
        int Codigo = sc.nextInt();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo() == Codigo) {
                System.out.println("Codigo: " + libros.get(i).getCodigo() + " Nombre: " + libros.get(i).getNombre()
                        + " Autor: " + libros.get(i).getAutor() + " Genero: " + libros.get(i).getGenero()
                        + " Disponibilidad: " + libros.get(i).getDisponibilidad());
            } else {
                System.out.println("Codigo de Libro No Encontrado");
            }
        }

    }

}
