package desafio1;

import java.util.Scanner;

public class SalvaContas {
    public static void main(String[] args) {
       System.out.println("Deseja fazer alguma operação?");
        System.out.println("Digite *1* para sim e *0* para não");
        Scanner scan =new Scanner(System.in);
        byte respostaCliente=scan.nextByte();

        Conta contaTranferencia=new ContaPoupanca();
        while(respostaCliente==1){
            Conta contaCliente=new ContaCorrente();
            System.out.println("Por favor, verifique se esta é sua conta:");
            System.out.println("agencia: "+contaCliente.getAgencia()+" conta número: "+contaCliente.getNumero());
            respostaCliente=scan.nextByte();
            while(respostaCliente==0){}
            System.out.println("Digite *1* para confirmar as informações ou *0* para acessar outra conta.");
            System.out.println("Deseja fazer outra operação?");
            System.out.println("Digite *1* para sim e *0* para não");
            respostaCliente=scan.nextByte();
        }

        System.out.println("Obrigado por utilizar nossos serviços.");

    }
}
