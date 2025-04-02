import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Loterica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            int numero;
            do {
                numero = random.nextInt(60) + 1; // Gera número entre 1 e 60
            } while (contem(numerosSorteados, numero)); // Evita repetições
            numerosSorteados[i] = numero;
        }

        int[] numerosApostados = new int[6];
        System.out.println("LOTERICA ESTRELA DA SORTE");
        System.out.println("Digite OS 6 números DA MEGA SENA entre 1 e 60:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosApostados[i] = scanner.nextInt();

            while (numerosApostados[i] < 1 || numerosApostados[i] > 60) {
                System.out.println("Esse numero não é válido! Escolha entre 1 e 60.");
                numerosApostados[i] = scanner.nextInt();
            }
        }

        int acertos = 0;
        for (int apostado : numerosApostados) {
            if (contem(numerosSorteados, apostado)) {
                acertos++;
            }
        }

        System.out.println("\nRESULTADO");
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
        System.out.println("Seus números: " + Arrays.toString(numerosApostados));
        System.out.println("Você acertou " + acertos + " número(s)!");

        scanner.close();
    }

    private static boolean contem(int[] array, int numero) {
        for (int n : array) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}