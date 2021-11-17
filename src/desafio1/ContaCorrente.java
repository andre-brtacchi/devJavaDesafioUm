package desafio1;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
        super(tipoConta.CORRENTE, AGENCIA_PADRAO,
                SEQUENCIAL);
       SEQUENCIAL+=1;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        this.imprimirInfosProtegidas();
    }

}
