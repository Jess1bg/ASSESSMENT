import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class SimulaEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("SIMULADOR DE EMPRÉSTIMO");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor inserir o valor desejado para empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        int parcelas;
        do {
            System.out.print("Em quantas parcelas deseja pagar (6 a 48)? ");
            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Desculpe, esse número de parcelas é inválido! Digite um valor entre 6 e 48.");
            }
        } while (parcelas < 6 || parcelas > 48);

        double jurosMensal = 0.03;
        double valorTotal = valorEmprestimo * Math.pow(1 + jurosMensal, parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\nSIMULAÇÃO");
        System.out.println("Cliente: " + nome);
        System.out.println("Valor do empréstimo: " + currencyFormatter.format(valorEmprestimo));
        System.out.println("Parcelas: " + parcelas + "x");
        System.out.println("Taxa de juros: 3% ao mês");
        System.out.println("Valor total a pagar: " + currencyFormatter.format(valorTotal));
        System.out.println("Valor da parcela mensal: " + currencyFormatter.format(valorParcela));

        scanner.close();
    }
}