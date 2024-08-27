package atividades;

import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o raio? ");
        double raio = teclado.nextDouble();
        System.out.println("Qual a altura?");
        double altura = teclado.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume de " + volume );
        teclado.close();
    }
    
}
//Math.sqrt = raiz quadrada.
