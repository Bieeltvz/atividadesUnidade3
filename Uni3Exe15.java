import java.util.Scanner;



public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um numero de ate 3 digitos");
        int n = teclado.nextInt();
        int centena = n / 100;
        int dezena = (n % 100) / 10;
        int unidade = n % 10;
        System.out.println(centena + " Centenas, " + dezena + " Dezenas e " + unidade + " Unidades");
        teclado.close();
    }
    
}
