package atividades;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner valorPago = new Scanner(System.in);
        System.out.println("Quanto de gasolinda você quer colocar?");
        float litroPreco = 5;
        float valorPagamento = valorPago.nextFloat();
        float totalLitros = valorPagamento / litroPreco;
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println();
        
        
        System.out.println("O seu tanque encheu " + df.format(totalLitros) + " litros");


        valorPago.close();
    //DecimalFormat df = new DecimalFormat("00.000");
    //system.out.println(df.format(valor));
    //system.out.println(df.format(valor2));
        //# = numero opcional/ 0 = numero obrigatorio
        // system.out.printf("o %s mora em %s ha muito tempo", nome, cidade)
    }
    
}
