package Mentorama.DesafioMod7;

public class ContaPoupanca extends Conta{

    private double taxajuros;

    public ContaPoupanca(String banco, int numeroAgencia, int numeroConta, double saldoConta, double taxajuros) {
        super(banco, numeroAgencia, numeroConta, saldoConta);
        this.taxajuros = taxajuros;
    }

    public double getSaldo() {
        return this.saldo + (this.taxajuros * saldo);
    }

    public double sacar(double valor) {
        setSaldo(getSaldo() - valor);
        return valor;
    }

    public double depositar(double valor){
        setSaldo(getSaldo() + valor);
        return valor;
    }

    public String retornoSaldo(){
        return "Conta Poupança - Banco: " + getBanco() + " " +
                "Agência: " + getNumeroAgencia() + " " + "Numero da Conta: " + getNumeroConta() +
                " " + "Saldo sem juros: " + saldo + " " + "Saldo + Rendimentos: " + getSaldo();
    }
}
