package Mentorama.DesafioMod7;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(String banco, int numeroAgencia, int numeroConta, double saldoConta, double chqueEspecial) {
        super(banco, numeroAgencia, numeroConta, saldoConta);
        this.chequeEspecial = chqueEspecial;
    }

    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }
}
