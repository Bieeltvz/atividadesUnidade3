import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do funcionario?");
        String nome = teclado.nextLine();
        System.out.println("Quantas horas trabalhadas no mes?");
        float horasTrabalhadas = teclado.nextFloat();
        System.out.println("Quantos dependentes na familia?");
        int dependentes = teclado.nextInt();
        double salarioBruto = horasTrabalhadas * 10;
        double descontoINSS = 8.5 / 100 * salarioBruto;
        double descontoImpRenda = 5 / 100 * salarioBruto;
        double salario = horasTrabalhadas * 10 - descontoINSS - descontoImpRenda;
        double salarioFamilia = dependentes * 60;
        DecimalFormat df = new DecimalFormat("##000.00");
        System.out.println(" Nome: "+ nome + " Salario bruto: " + df.format(salarioBruto  + salarioFamilia) + " Salario liquido: " + df.format(salario + salarioFamilia));
        teclado.close();
    }
    
}
