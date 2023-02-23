package Mentorama.DesafioMod7;

public class ContaMain {
    public static void main(String[] args) {

        Conta cp1 = new ContaPoupanca("Itau", 1111, 2222, 1000.00, 0.01);
        System.out.println(cp1);
        cp1.depositar(150.00);
        System.out.println(cp1);
    }
}
