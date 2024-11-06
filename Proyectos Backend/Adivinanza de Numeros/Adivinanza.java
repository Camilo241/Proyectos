import java.util.Scanner;

public class Adivinanza {
    int Usuario = 0;
    int Aleatorio = (int) (Math.random()*100);

    public int NumeroEncontrar() {
        Scanner sc = new Scanner(System.in);
        while (Usuario != Aleatorio) {
            System.out.println("Adivina el número:");
            Usuario = sc.nextInt(); 
            if (Aleatorio > Usuario) {
                System.out.println("El número es más grande.");
            } else if (Aleatorio < Usuario) {
                System.out.println("El número es más pequeño.");
            } else {
                System.out.println("¡Felicidades! Has encontrado el número.");
            }
        }
        sc.close();
        return Aleatorio;
    }

}
