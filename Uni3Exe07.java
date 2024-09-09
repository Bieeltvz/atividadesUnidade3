import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas latinhas de 350ml voce deseja?");
        int latinhas = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml voce deseja?");
        int garrafas = teclado.nextInt();
        System.out.println("Quantas garrafas de 2 litros voce deseja?");
        int litroes = teclado.nextInt();      
        double litroesTotal = litroes * 2.0;
        double latinha = latinhas * 0.35;
        double garrafaMedia = garrafas * 0.6;
        double totalLitros = latinha + garrafaMedia + litroesTotal;
        DecimalFormat df = new DecimalFormat("##0.00");
        System.out.println("O total de litros que voce comprou é: " + df.format(totalLitros));
        teclado.close();

    }
    }

