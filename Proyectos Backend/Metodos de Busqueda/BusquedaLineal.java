import java.util.Scanner;

public class BusquedaLineal {
    
    public void Busqueda(int array[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar en el array");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if(numero == array[i]) {
                System.out.println("El numero: "+ numero +" esta en la posicion: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El numero: " + numero + " no esta en el array.");
        }

        sc.close();
    }
}
