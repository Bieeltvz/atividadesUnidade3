import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a distancia percorrida?");
        double distancia = teclado.nextDouble();
        System.out.println("Qual o tempo gasto?");
        double tempo = teclado.nextDouble();
        double veloMedia = distancia / tempo;
        double kmPorLitro = 12.0;
        double combustivelGasto = distancia / kmPorLitro;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("A velocidade média foi de " + veloMedia + " km/hr e a quantidade de combustivel gasta foi de " + df.format(combustivelGasto) + " l" );
        teclado.close();
    }
    
}
