import java.util.ArrayList;
import java.util.Scanner;

class Socios {
    private static ArrayList<Socio> socios = new ArrayList<>();

    public static void CrearSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Identificacion.");
        int identificacion = sc.nextInt();
        System.out.println("Ingrese su Nombre.");
        String Nombre = sc.nextLine();
        System.out.println("Ingrese su Direccion.");
        String Direccion = sc.nextLine();
        Socio NuevoSocio = new Socio(identificacion, Nombre, Direccion);
        socios.add(NuevoSocio);
        System.out.println("AgregadoConExito");
        sc.close();
    }

    public static void ActualizarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Identificacion a buscar.");
        int identificacion = sc.nextInt();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                System.out.println("Ingrese su Nombre.");
                String Nombre = sc.nextLine();
                System.out.println("Ingrese su Direccion.");
                String Direccion = sc.nextLine();
                socios.get(identificacion).setNombre(Nombre);
                socios.get(identificacion).setDireccion(Direccion);
                System.out.println("Usuario Actualizado");
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }
        sc.close();
    }

    public static void EliminarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Identificacion a Eliminar.");
        int identificacion = sc.nextInt();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                socios.remove(i).getIdentificacion();
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }
        sc.close();
    }

    public static void ImprimirSocios() {
        for (int i = 0; i < socios.size(); i++) {
            System.out.println("Identificacion: " + socios.get(i).getIdentificacion() + " Nombre: " + socios.get(i).getNombre() + " Direccion: " + socios.get(i).getDireccion());
        }
    }

    public static void BuscarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Identificacion a buscar.");
        int identificacion = sc.nextInt();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                System.out.println("Identificacion: " + socios.get(i).getIdentificacion() + " Nombre: " + socios.get(i).getNombre() + " Direccion: " + socios.get(i).getDireccion());
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }
        sc.close();
    }

    public static void BuscarSocioNoFiable() {
    }

}
