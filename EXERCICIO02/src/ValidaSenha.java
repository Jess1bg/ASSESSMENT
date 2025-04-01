import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        boolean senhaValida = false;
        String senha;

        do {
            System.out.print("\nDigite sua senha (mínimo 8 caracteres, com maiúscula, número e caractere especial): ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres.");
                continue;
            }

            if (!contemMaiuscula(senha)) {
                System.out.println("Erro: A senha deve conter pelo menos uma letra maiúscula.");
                continue;
            }

            if (!contemNumero(senha)) {
                System.out.println("Erro: A senha deve conter pelo menos um número.");
                continue;
            }

            if (!contemCaractereEspecial(senha)) {
                System.out.println("Erro: A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
                continue;
            }

            senhaValida = true;

        } while (!senhaValida);

        System.out.println("\nO seu cadastro foi realizado com sucesso para " + nome + "!");
        scanner.close();
    }

    private static boolean contemMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contemNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contemCaractereEspecial(String senha) {
        String especiais = "!@#$%^&*()-+_=[]{}|;:',.<>?/";
        for (char c : senha.toCharArray()) {
            if (especiais.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}