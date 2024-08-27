package atividades;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a primeira nota?");
        short n1 = teclado.nextShort();
        System.out.println("Qual a segunda nota?");
        short n2 = teclado.nextShort();
        System.out.println("Qual a terceira nota?");
        short n3 = teclado.nextShort();
        short p1 = 5;
        short p2 = 3;
        short p3 = 2;
        double media = (p1 * n1 + p2 * n2 + p3 * n3) / (p1 + p2 + p3);
        System.out.println("A média do aluno é: " + media);
        teclado.close();
    }
    
}
