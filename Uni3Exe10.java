import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a medida do primeiro cateto? ");
        float cateto1 = teclado.nextFloat();
        System.out.println("Qual a medida do segundo catetp?");
        float cateto2 = teclado.nextFloat();
        double hip = (Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
        System.out.println("O comprimento da hipotenusa é: " + hip);
        teclado.close();

    }
    
}
