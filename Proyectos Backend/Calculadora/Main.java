import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            Calculadora cal = new Calculadora();
            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    // Pide los números solo para las opciones de cálculo
                    System.out.println("Ingrese el primer número:");
                    int Numero1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int Numero2 = sc.nextInt();

                    switch (opcion) {

                        case 1:
                            int ResultadoS = cal.Sumar(Numero1, Numero2);
                            System.out.println("El Resultado de la Suma es:  " + ResultadoS);
                            break;
                        case 2:
                            int ResultadoR = cal.Restar(Numero1, Numero2);
                            System.out.println("El Resultado de la Restar es: " + ResultadoR);
                            break;
                        case 3:
                            int ResultadoM = cal.Multiplicacion(Numero1, Numero2);
                            System.out.println("El Resultado de la Multiplicacion es: " + ResultadoM);
                            break;
                        case 4:
                            double ResultadoD = cal.Divicion(Numero1, Numero2);
                            System.out.println("El Resultado de la Divicion es: " + ResultadoD);
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Muchas Gracias");
                    break;

                default:
                    System.out.println("Sepa leer el menú.");

            }
            sc.close();
        }
    }
}