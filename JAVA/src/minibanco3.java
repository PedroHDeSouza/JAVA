import java.util.Scanner;

public class minibanco3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Banco ti---");

        double saque = 0;
        int deposito = 0;
        double saldo = 0;
        int opcao = 0;

        while (opcao != 4){

            System.out.println("1 - sacar");
            System.out.println("2 - deposito");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - sair");

            System.out.println("Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite seu saque: ");
                saque = scanner.nextDouble();

                if (saldo >= saque){
                    saldo = saldo - saque;
                }else {
                    System.out.println("Saldo insuficiente");
                }

            }else if (opcao == 2){

                System.out.println("Digite seu deposito: ");
                deposito = scanner.nextInt();
                saldo = saldo + deposito;

                System.out.println("Deposito realizado");
            }else if (opcao == 3){
                System.out.println("Seu saldo é: "+saldo);
            }else {
                System.out.println("Opçao invalida");
            }
        }

    }
}
