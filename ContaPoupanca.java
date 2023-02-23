package Mentorama.DesafioMod7;

public class ContaPoupanca extends Conta{

    private double taxajuros;
    private double deposito;

    public ContaPoupanca(String banco, int numeroAgencia, int numeroConta, double saldoConta, double taxajuros) {
        super(banco, numeroAgencia, numeroConta, saldoConta);
        this.taxajuros = taxajuros;
    }

    public double getSaldo() {
        return this.saldo + (this.taxajuros * saldo);
    }

    public String retornoSaldo(){
        return "Conta Poupança - Banco: " + getBanco() + " " +
                "Agência: " + getNumeroAgencia() + " " + "Numero da Conta: " + getNumeroConta() +
                " " + "Saldo sem juros: " + saldo + " " + "Saldo + Rendimentos: " + getSaldo();
    }

    public String retornoDeposito() {
        return "Novo Saldo: " + saldo;
    }
}
