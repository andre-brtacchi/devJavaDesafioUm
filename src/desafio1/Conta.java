package desafio1;

public abstract class Conta implements OperacoesBancarias {

    private Pessoa titular;
    protected static int AGENCIA_PADRAO=1;
    protected static int SEQUENCIAL=1;
    enum tipoConta{CORRENTE,POUPANCA};
    private final tipoConta tipo;
    public Conta(tipoConta tipo, Integer agencia, int numero) {
        this.tipo = tipo;
        this.agencia = agencia;
        this.numero = numero;
    }

    private final Integer agencia;
    private final Integer numero;
    private Double saldo=0.0;
    private Double limite=saldo*0.1;


    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }


    public Double getSaldo() {
        return saldo;
    }

    public void calculaLimite(){
        this.limite=this.saldo*0.1;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
        @Override
        public void sacar(double valor) {
        saldo=saldo-valor;
        calculaLimite();
            System.out.println("você retirou: "+valor+", seu saldo agora é de: "+saldo);

    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

        @Override
        public void depositar(double valor) {
            saldo+=valor;
            System.out.println("você depositou: "+valor+", seu saldo agora é de: "+saldo);
            calculaLimite();

    }

        @Override
        public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        calculaLimite();

            System.out.println("você depositou "+valor+", seu saldo é de "+this.saldo);
    }

    protected void imprimirInfosProtegidas(){
        System.out.println("Agência: "+this.getAgencia().toString());
        System.out.println("Conta Corrente: "+this.getNumero().toString());
        System.out.println(String.format("Seu saldo é de R$ %.2f", this.getSaldo()));
    }


    }
