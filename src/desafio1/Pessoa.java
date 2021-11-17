package desafio1;

public class Pessoa {
    protected final String name;
    protected final String cpf;
    protected Conta contaCorrente=new ContaCorrente();
    protected Conta contaPoupanca=new ContaPoupanca();

    public Pessoa(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
