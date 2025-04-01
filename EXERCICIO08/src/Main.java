public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria Bethania", 10000);
        Estagiario estagiario = new Estagiario("Gilberto Gil", 2000);

        System.out.println("Gerente " + gerente.nome + ": R$" + gerente.calcularSalario());
        System.out.println("Estagiário " + estagiario.nome + ": R$" + estagiario.calcularSalario());
    }
}