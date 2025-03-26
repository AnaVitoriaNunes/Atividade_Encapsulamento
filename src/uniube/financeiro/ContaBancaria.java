package uniube.financeiro;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;
    private double limiteCredito;

    public ContaBancaria(String numeroConta, double saldo, String titular, double limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteCredito;
        if (valor > 0 && valor <= saldoDisponivel) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                double diferenca = valor - saldo;
                saldo = 0;
                limiteCredito -= diferenca;
            }
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque negado! Saldo insuficiente.");
        }
    }

    public double verificarSaldoDisponivel() {
        return saldo + limiteCredito;
    }

    public void aumentarLimite(double valor) {
        if (valor > 0) {
            this.limiteCredito += valor;
            System.out.println("Limite de crédito aumentado. Novo limite: R$ " + this.limiteCredito);
        } else {
            System.out.println("Valor do aumento deve ser maior que zero.");
        }
    }
}

