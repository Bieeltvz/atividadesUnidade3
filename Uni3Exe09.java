package atividades;

import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Qual o raio? ");
        double raio = teclado.nextDouble();
        System.out.println("Qual a altura?");
        double altura = teclado.nextDouble();
        double volume = pi * Math.pow(raio, 2) * altura;
        System.out.println("Volume de " + volume );
        teclado.close();
    }
    
}
