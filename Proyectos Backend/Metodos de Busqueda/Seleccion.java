import java.util.Arrays;

public class Seleccion {
    // 4,9,8,3,7,6,15,2
    public static void Ordenamiento(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
