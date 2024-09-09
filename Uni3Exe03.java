import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner valorPago = new Scanner(System.in);
        System.out.println("Quanto de gasolinda você quer colocar?");
        int litroPreco = 5;
        int valorPagamento = valorPago.nextInt();
        int totalLitros = valorPagamento / litroPreco;
        System.out.println("O seu tanque encheu " + totalLitros + " litros");
        valorPago.close();
    

    }
    
}
