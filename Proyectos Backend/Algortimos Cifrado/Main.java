import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra a cifrar");
        String palabra = sc.nextLine();
        String alfabeto = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        Caesar.Cesar4(palabra, alfabeto);
        Caesar.Cesar9(palabra, alfabeto);

        sc.close();
    }
}
