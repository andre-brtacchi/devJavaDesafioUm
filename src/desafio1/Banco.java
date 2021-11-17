package desafio1;

import javax.swing.*;

public class Banco {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JList<Conta> getContas() {
        return contas;
    }

    public void setContas(JList<Conta> contas) {
        this.contas = contas;
    }

    public String nome;
    private JList<Conta> contas;
}
