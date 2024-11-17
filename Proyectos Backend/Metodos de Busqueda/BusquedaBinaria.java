import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    
    public static void Ordenamiento(int []  array){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j]> array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                System.out.println("El numero: " + numero + " se encuentra en la posicion: " + i);
            }
        }
        
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
