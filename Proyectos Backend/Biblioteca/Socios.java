import java.util.ArrayList;
import java.util.Scanner;

class Socios {
    private static ArrayList<Socio> socios = new ArrayList<>();

    public static void CrearSocio(Scanner sc) {
        System.out.println("Ingrese su Identificacion.");
        int identificacion = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su Nombre.");
        String Nombre = sc.nextLine();
        System.out.println("Ingrese su Direccion.");
        String Direccion = sc.nextLine();
        Socio NuevoSocio = new Socio(identificacion, Nombre, Direccion);
        socios.add(NuevoSocio);
        System.out.println("El Socio ha Sido agregado con exito.");
        
    }

    public static void ActualizarSocio(Scanner sc) {
        System.out.println("Ingrese la Identificacion a buscar.");
        int identificacion = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                System.out.println("Ingrese su Nombre.");
                String Nombre = sc.nextLine();
                System.out.println("Ingrese su Direccion.");
                String Direccion = sc.nextLine();
                socios.get(i).setNombre(Nombre);
                socios.get(i).setDireccion(Direccion);
                System.out.println("Usuario Actualizado");
                break;
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }
        
    }

    public static void EliminarSocio(Scanner sc) {
        System.out.println("Ingrese la Identificacion a Eliminar.");
        int identificacion = sc.nextInt();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                socios.remove(i).getIdentificacion();
                System.out.println("El socio ha sido Eliminado");
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }

    }

    public static void ImprimirSocios() {
        if (socios.size() == 0) {
            System.out.println("No hay Socios por el Momento");
        }else{
            for (int i = 0; i < socios.size(); i++) {
                System.out.println(socios.size());
                if (socios.size()>=1) {
                System.out.println(socios.toString());
                }else{
                    
                }
            }
        }
    }

    public static void BuscarSocio(Scanner sc) {
        System.out.println("Ingrese la Identificacion a buscar.");
        int identificacion = sc.nextInt();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getIdentificacion() == identificacion) {
                System.out.println("Identificacion: " + socios.get(i).getIdentificacion() + " Nombre: " + socios.get(i).getNombre() + " Direccion: " + socios.get(i).getDireccion());
            } else {
                System.out.println("Usuario No Encontrado");
            }
        }

    }

    public static void BuscarSocioNoFiable() {
    }

}
