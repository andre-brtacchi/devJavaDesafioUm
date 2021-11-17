package main;

public class Endereco {

    private enum TipoEndereco{RESIDENCIAL, ENTREGA,TRABALHO};
    private String logradouro;
    private Integer numero;
    private String cep;
    private String complemento;
    private TipoEndereco tipo;
}
