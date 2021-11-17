package main;

import main.AdicionaCliente;

public class programa {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
       cliente=AdicionaCliente.addCliente();
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());

    }


}
