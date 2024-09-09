import java.util.Scanner;

public class Uni3Exe5 {
    public static void main(String[] args) {
        Scanner frangos = new Scanner(System.in);
        System.out.println("Quantos frangos tem na granja?");
        int qtdFrangos = frangos.nextInt();
        int peDireito = 4;
        int peEsquerdo = 7;
        int frango = peDireito + peEsquerdo;
        System.out.print("O preço total gasto na granja é de: " + frango * qtdFrangos);
        frangos.close();

    }
    
}
