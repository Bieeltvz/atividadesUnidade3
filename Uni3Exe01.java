import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
    Scanner terreno = new Scanner(System.in);   
    System.out.print("Informe a largura do terreno: ");
    int largura = terreno.nextInt();
    System.out.print("Informe o comprimento do terreno: ");
    int comprimento = terreno.nextInt();
    int terrenoTamanho = largura * comprimento;
    System.out.print("a area do terreno é " + terrenoTamanho);
    terreno.close();
    }
}
