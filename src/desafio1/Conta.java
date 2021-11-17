package desafio1;

public abstract class Conta implements OperacoesBancarias {
    protected static int AGENCIA_PADRAO=1;
    protected static int SEQUENCIAL=1;
    enum tipoConta{CORRENTE,POUPANCA};
    private final tipoConta tipo;
    public Conta(tipoConta tipo, Integer agencia, Integer numero) {
        this.tipo = tipo;
        this.agencia = agencia;
        this.numero = numero;
    }

    private final Integer agencia;
    private final Integer numero;
    private Double saldo=0.0;


    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
        @Override
        public void sacar(double valor) {
        saldo=saldo-valor;
            System.out.println("você retirou: "+valor+", seu saldo agora é de: "+saldo);

    }

        @Override
        public void depositar(double valor) {
            saldo+=valor;
            System.out.println("você depositou: "+valor+", seu saldo agora é de: "+saldo);

    }

        @Override
        public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

            System.out.println("você depositou "+valor+", seu saldo é de "+this.saldo);
    }

    protected void imprimirInfosProtegidas(){
        System.out.println("Agência: "+this.getAgencia().toString());
        System.out.println("Conta Corrente: "+this.getNumero().toString());
        System.out.println(String.format("Seu saldo é de R$ %.2f", this.getSaldo()));
    }


    }
