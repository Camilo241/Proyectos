package Palindromos;

import java.util.Scanner;

public class Palindromo {

    public void palabras(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la palabra a averiguar");
        String texto = sc.nextLine();
        String original = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            original += texto.charAt(i);
            System.out.println(original);
        }
        if (texto.equals(original)) {
            System.out.println("La palabra es un Palindromo");
        }else{
            System.out.println("La palabra no es un Palindromo.");
        }
        sc.close();
    }
}
