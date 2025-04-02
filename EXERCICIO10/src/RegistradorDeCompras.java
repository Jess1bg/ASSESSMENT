import java.io.*;
import java.util.Scanner;

public class RegistradorDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter arquivo = new FileWriter("compras.txt");
            BufferedWriter escritor = new BufferedWriter(arquivo);

            System.out.println("COMPRAS");
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nCompra " + i + ":");
                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço unitário: R$");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                escritor.write(produto + "," + quantidade + "," + preco);
                escritor.newLine();
            }
            escritor.close();

            System.out.println("\nCOMPRAS REGISTRADAS");
            BufferedReader leitor = new BufferedReader(new FileReader("compras.txt"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                System.out.println("Produto: " + dados[0] +
                        " | Quantidade: " + dados[1] +
                        " | Total: R$" + (Integer.parseInt(dados[1]) * Double.parseDouble(dados[2])));
            }
            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro de arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}