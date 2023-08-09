import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = Scanner(System.in);
        //int operacao =0;
        System.out.println ("""
                 ****************************
                 Dados Iniciais do Cliente
                 Nome: Fabio Lapa
                 Tipo de conta: Corrente
                 Saldo inicial: R$ 2500,00
                 ****************************
                """);
        System.out.println("Operações");

        System.out.println(" 1 - Consultar saldos");
        System.out.println(" 2 - Receber Valor ");
        System.out.println(" 3 - Transferir valor");
        System.out.println("4 - Sair");
        leitura = leitura.nextInt();

    switch case 1 == leitura {
        System.out.println("Opcao escolhida " + leitura);
        break;
    }
    }
}
