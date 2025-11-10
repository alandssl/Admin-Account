package banco.src;

import java.util.Scanner;

public class Program {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        Acount a;

        System.out.println("Escreva o número da conta: ");
        int conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Escreva o nome do titular da conta: ");
        String nome = sc.nextLine();

        System.out.println("Deseja fazer umm depósito inicial?(s/n)");
        String resposta = sc.nextLine();

        if (resposta.equals("s")) {
            System.out.println("Entre com o depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            a = new Acount(conta, nome, depositoInicial);
            System.out.println(a);
        } else {
            a = new Acount(conta, nome);
            System.out.println(a);
        }
        System.out.println("Escreva o valor do depósito: ");
        double deposito = sc.nextDouble();

        a.Deposito(deposito);
        System.out.println(a);

        System.out.println("Escreva o valor do saque: ");
        double saque = sc.nextDouble();

        a.Saque(saque);
        System.out.println(a);

        sc.close();
    }

}
