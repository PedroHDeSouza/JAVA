import java.util.Scanner;

public class minibanco2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Banco ti---");

        int saque = 0;
        int saldo = 2000;
        int escolha = 0;

        while (escolha != 3) {

            System.out.println("1 - Sacar");
            System.out.println("2 - Consultar Saldo");
            System.out.println("3 - Sair");

            System.out.println("Escolha: ");
            escolha = scanner.nextInt();

            if (escolha == 1){

                System.out.println("Qual é seu saque: ");
                saque = scanner.nextInt();

                if (saldo >= saque){
                    saldo = saldo - saque;
                    System.out.println("Saque realizado");
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else if (escolha == 2){

                System.out.println("saldo:" + saldo);

            }

        }
    }
}
