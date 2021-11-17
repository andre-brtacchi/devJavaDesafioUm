package desafio1;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super(tipoConta.POUPANCA, Conta.AGENCIA_PADRAO, SEQUENCIAL);
        SEQUENCIAL+=1;
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupança ===");
        this.imprimirInfosProtegidas();
    }
}
