package atividades;
import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args) {
        double quilo = 25.0;
        Scanner prato = new Scanner(System.in);
        System.out.println("Qual é o peso do prato?");
        double pesoPrato = prato.nextDouble() - 0.75;
        double valorPagar = pesoPrato * quilo;
        System.out.println("O valor a ser pago é: " + valorPagar);
        
        
            
        prato.close();
    }
    
}

