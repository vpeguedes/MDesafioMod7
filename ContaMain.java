package Mentorama.DesafioMod7;

public class ContaMain {
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        Conta cp1 = new ContaPoupanca(
                "Itau", 1111, 2222, 1000.00, 0.01);

        Conta cc1 = new ContaCorrente(
                "Bradesco", 2222, 3333, 1000.00, 200.00);

        Conta cs1 = new ContaSalario(
                "Caixa Economica", 3333, 4444, 1000.00, 2);

        contas[0] = cp1;
        contas[1] = cc1;
        contas[2] = cs1;

        cs1.sacar(500.00);
        cs1.sacar(500.00);
        cs1.sacar(100.00);

        cc1.depositar(1000.00);

        System.out.print("Saldo das contas: ");
        for(Conta conta : contas){
            System.out.println(conta);
            System.out.println("Saldo atual: R$" + conta.getSaldo());
            System.out.println("-------------------------------------");
        }


    }
}
