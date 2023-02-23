package Mentorama.DesafioMod7;

public abstract class Conta {
    private String banco;
    private int numeroAgencia;
    private int numeroConta;
    protected double saldo;
    private double deposito;
    private double novoSaldo;

    public Conta (String banco, int numeroAgencia, int numeroConta, double saldo) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "banco='" + banco + '\'' +
                ", numeroAgencia=" + numeroAgencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }


    public void depositar(double deposito){
        double novoSaldo = this.deposito + saldo;
    }
}
