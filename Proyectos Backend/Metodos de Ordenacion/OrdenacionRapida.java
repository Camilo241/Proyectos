import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacionRapida {

    public static void Ordenamiento(int[] array) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int pivote = array[numero];
        ArrayList<Integer> listaMenor = new ArrayList<>();
        ArrayList<Integer> listaMayor = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > pivote) {
                listaMayor.add(array[i]);
            }else{
                listaMenor.add(array[i]);
            }
        }

        for (int j = 0; j < listaMenor.size(); j++) {
            if (listaMenor.get(j) == pivote) {
                listaMenor.remove(j);
            }
        }
        
        int[] arraymenor = listaMenor.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < arraymenor.length; i++) {
            for (int j = 0; j < arraymenor.length; j++) {
                if (arraymenor[j] > arraymenor[i]) {
                    int temp = arraymenor[i];
                    arraymenor[i] = arraymenor[j];
                    arraymenor[j] = temp;
                }
            }
        }
        
        int[] arraymayor = listaMayor.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < arraymayor.length; i++) {
            for (int j = 0; j < arraymayor.length; j++) {
                if (arraymayor[j] > arraymayor[i]) {
                    int temp = arraymayor[i];
                    arraymayor[i] = arraymayor[j];
                    arraymayor[j] = temp;
                }
            }
        }
        
        
        System.out.println("Su Array ordenado por Ordenacion rapida es: " + Arrays.toString(arraymenor) + " " + pivote +" " + Arrays.toString(arraymayor));
        sc.close();
    }
}
