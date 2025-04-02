public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Seu saldo é insuficiente para realizer o saque de R$" + valor);
            }
        } else {
            System.out.println("Este Valor de saque é inválido!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta de " + titular + ": R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Luisa Sonza");

        conta.exibirSaldo();
        conta.depositar(5000);
        conta.sacar(520);
        conta.sacar(860);
        conta.depositar(-200);
        conta.exibirSaldo();
    }
}