package main;

import java.util.ArrayList;
import java.util.List;

public class Cliente  extends Pessoa {




    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    private Integer codigo;

    List<Endereco> enderecos;



    public List<Endereco> getEnderecos() {
        if(enderecos==null){
            enderecos=new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
