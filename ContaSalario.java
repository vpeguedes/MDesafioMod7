package Mentorama.DesafioMod7;

public class ContaSalario extends Conta{

    private int limiteSaques;

    public ContaSalario(String banco, int numeroAgencia, int numeroConta, double saldoConta, int limiteSaques) {
        super(banco, numeroAgencia, numeroConta, saldoConta);
        this.limiteSaques = limiteSaques;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        if(limiteSaques == 0){
            System.out.println("Limite de saques excedido.");
        } else {
            System.out.println("Saques disponiveis: " + limiteSaques);
            this.limiteSaques --;
            this.saldo -= valor;
        }

        return 0.0;
    }

    public double depositar(double valor){
        setSaldo(getSaldo() + valor);
        return valor;
    }

    public String toString() {
        return "Saques disponiveis na conta salario: " + limiteSaques;
    }
}
