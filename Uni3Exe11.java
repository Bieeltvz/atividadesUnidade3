import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos graus?");
        double graus = teclado.nextDouble();
        double Ftemp = (9.0/5.0) * graus + 32;
        System.out.println("A temperatura em °F é: " + Ftemp);
        teclado.close();
    }
    
}
