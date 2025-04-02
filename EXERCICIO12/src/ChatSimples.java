import java.util.Scanner;

public class ChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            String usuarioAtual = (i % 2 == 0) ? usuario1 : usuario2;
            System.out.print(usuarioAtual + ", digite sua mensagem: ");
            mensagens[i] = usuarioAtual + ": " + scanner.nextLine();
        }

        System.out.println("\nHistórico de Mensagens");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        System.out.println("\nObrigado por utilizar o nosso super chat, até logo! ");

        scanner.close();
    }
}