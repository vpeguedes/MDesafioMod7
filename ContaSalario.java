package Mentorama.DesafioMod7;

public class ContaSalario extends Conta{

    public ContaSalario(String banco, int numeroAgencia, int numeroConta, double saldoConta) {
        super(banco, numeroAgencia, numeroConta, saldoConta);
    }

    public double getSaldo() {
        return this.saldo;
    }
}
