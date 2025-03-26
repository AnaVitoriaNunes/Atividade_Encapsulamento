package uniube.financeiro;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", 500.00, "Maria Silva", 1000.00);

        System.out.println("Saldo inicial disponível: R$ " + conta.verificarSaldoDisponivel());

        System.out.println("\nTentando sacar R$ 800...");
        conta.sacar(800);

        System.out.println("\nTentando sacar R$ 2000...");
        conta.sacar(2000);

        System.out.println("\nSaldo disponível após saque: R$ " + conta.verificarSaldoDisponivel());

        System.out.println("\nAumentando Limite...");
        conta.aumentarLimite(500.0);
    }
}
