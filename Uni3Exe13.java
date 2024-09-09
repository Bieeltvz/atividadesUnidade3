import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o comprimento da parede em metros?");
        int comprimento = teclado.nextInt();
        System.out.println("Qual a altura da parede em metros?");
        int altura = teclado.nextInt();
        int metrosQuadrado = comprimento * altura;
        double azulejoEmMetrosQuadrado = 12.50  * 9;
        double valor = metrosQuadrado  * azulejoEmMetrosQuadrado;
        DecimalFormat df = new DecimalFormat("######.##");
        System.out.println("Valor gasto com a compra de azulejos R$" + df.format(valor));
        teclado.close();      
    }
    
}
