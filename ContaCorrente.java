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

    public double sacar(double valor){
        System.out.println("Valor do saque: " + valor);
        if(valor <= (getSaldo() + chequeEspecial)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: " + getSaldo());

            if(getSaldo() < 0) {
                System.out.println("Valor restante do chque especial: R$" + getChequeEspecial());
            }
            return valor;
        } else {
            System.out.println("Saldo insuficiente. Seu saldo atual é: R$" + chequeEspecial);
        }

        return 0.0;
    }

    public double depositar(double valor) {
        System.out.println("Valor a ser depositado: R$" + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Seu saldo atual é: R$" + getSaldo());
        return valor;
    }

    private double getChequeEspecial() {
        if(getSaldo() < 0){
            return chequeEspecial - Math.abs(getSaldo());
        } else {
            return chequeEspecial;
        }
    }
}
