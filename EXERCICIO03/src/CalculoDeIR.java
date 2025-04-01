import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculoDeIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Calculando o IR");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;

        double imposto = 0;
        String faixa = "";

        if (salarioAnual <= 22847.76) {
            faixa = "Isento";
            imposto = 0;
        }
        else if (salarioAnual <= 33919.80) {
            faixa = "7,5%";
            imposto = salarioAnual * 0.075;
        }
        else if (salarioAnual <= 45012.60) {
            faixa = "15%";
            imposto = salarioAnual * 0.15;
        }
        else {
            faixa = "27,5%";
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquidoAnual = salarioAnual - imposto;

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário anual: " + currencyFormatter.format(salarioAnual));
        System.out.println("Faixa de imposto: " + faixa);
        System.out.println("Imposto a pagar: " + currencyFormatter.format(imposto));
        System.out.println("Salário líquido anual: " + currencyFormatter.format(salarioLiquidoAnual));

        scanner.close();
    }
}