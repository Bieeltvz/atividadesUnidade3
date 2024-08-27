package atividades;

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade a ser trocada: ");
        double dolares = teclado.nextDouble();
        double real = dolares * 5.48;
        System.out.println("Você trocou " + dolares + " dolares por " + real + " Reais");
        teclado.close();
    }
    
}
