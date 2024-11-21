import java.util.Scanner;

class MainCifrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra a cifrar");
        String palabra = sc.nextLine();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        Caesar.Cesar4(palabra, alfabeto);
        Caesar.Cesar9(palabra, alfabeto);
        
        sc.close();
    }
}
