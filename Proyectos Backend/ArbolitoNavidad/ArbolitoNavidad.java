package ArbolitoNavidad;

public class ArbolitoNavidad {
    
    static void creacionarbol(int n ){
        char simbolo = '*';
        int espacios = n/2;
        for (int i = 1; i <= n; i+=2) {
            for (int k = 1; k <= espacios ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(simbolo);
            }
            espacios--;
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        ArbolitoNavidad.creacionarbol(9);
    }
}
