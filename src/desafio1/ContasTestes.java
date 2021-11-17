package desafio1;

public class ContasTestes {
    public static void main(String[] args) {
        Conta cc= new ContaCorrente();
        Conta poupanca=new ContaPoupanca();
        cc.depositar(1000);
        poupanca.depositar(15000);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.transferir(3200, cc);
        cc.sacar(300);
        poupanca.imprimirExtrato();
        cc.imprimirExtrato();

    }
}
