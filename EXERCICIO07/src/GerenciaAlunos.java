import java.util.Scanner;

public class GerenciaAlunos {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public GerenciaAlunos(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificaAprovacao() {
        double media = calcularMedia();
        System.out.printf("Média: %.2f - ", media);
        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Número de matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        GerenciaAlunos aluno = new GerenciaAlunos(nome, matricula, nota1, nota2, nota3);

        System.out.println("\nRESULTADO FINAL");
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        aluno.verificaAprovacao();

        scanner.close();
    }
}