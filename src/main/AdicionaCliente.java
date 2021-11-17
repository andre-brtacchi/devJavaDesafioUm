package main;
import java.lang.System;
import java.util.Scanner;

public class AdicionaCliente {
    public static Cliente addCliente(){

        Cliente cliente = new Cliente();
        Scanner scan=new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        cliente.setNome(scan.nextLine());
        System.out.println("Por favor, digite seu cpf: ");
        cliente.setCpf(scan.next());
        return cliente;
    }
}
