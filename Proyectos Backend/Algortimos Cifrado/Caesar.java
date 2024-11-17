

public class Caesar {
    public static void Cesar4(String  palabra,String alfabeto){
        int desplazamiento = 4;
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (alfabeto.indexOf(letra) != -1) {
                int posicionOriginal = alfabeto.indexOf(letra);
                int nuevaPosicion = (posicionOriginal + desplazamiento) % alfabeto.length();
                resultado.append(alfabeto.charAt(nuevaPosicion));
            } else {
                
                resultado.append(palabra);
            }
        }
        System.out.println("La palabra Ingresada fue: " + palabra);
        System.out.println("La palabra con cifrado Cesar4 es: " + resultado);
    }
    public static void Cesar9(String palabra,String alfabeto){
        int desplazamiento = 9;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (alfabeto.indexOf(letra) != -1) {
                int posicionOriginal = alfabeto.indexOf(letra);
                int nuevaPosicion = (posicionOriginal + desplazamiento) % alfabeto.length();
                resultado.append(alfabeto.charAt(nuevaPosicion));
            } else {
                resultado.append(palabra);
            }
        }
        System.out.println("La palabra Ingresada fue: " + palabra);
        System.out.println("La palabra con cifrado Cesar4 es: " + resultado);
    }
}
