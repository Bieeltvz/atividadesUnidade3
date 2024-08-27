package atividades;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner preco = new Scanner(System.in);
        System.out.println("Qual é o preço do sapato?");
        float valor = preco.nextFloat();
        float desconto = valor * 12 / 100;
        System.out.println("O valor do desconto é de R$" + desconto);
        float total = valor - desconto;
        System.out.println("O preço do par de sapatos com o desconto é R$" + total);
        preco.close();
    }
    
}
