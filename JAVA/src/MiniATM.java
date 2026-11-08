import java.util.Scanner;

public class MiniATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---ATM---");

        int opçao = 0;
        double saldo = 1000;
        int saque = 0;
        int deposito = 0;

        while (opçao != 4){
            System.out.println("Escolha a opção: ");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - sair");

            opçao = scanner.nextInt();


            //CONSULTAR SALDO
            if (opçao == 1){
                System.out.println("Seu saldo é:  ");
                System.out.println(saldo);
            }

            //SACAR
            if (opçao == 2){
                System.out.println("quanto voce quer sacar: ");
                saque = scanner.nextInt();
            } if (saque <= saldo) {
                saldo = saldo - saque;
                System.out.println("Seu novo saldo é: "+ saldo);
            }else {
                System.out.println("nao foi possivel sacar esse valor, Saldo insuficiente");
            }

            //DEPOSITAR
            if (opçao == 3){
                System.out.println("Quanto vc quer depositar: ");
                deposito = scanner.nextInt();

            }if (deposito > 0){
                saldo = deposito + saldo;
                System.out.println("Seu saldo agora é: "+saldo);
            }else {
                System.out.println("Nao é possivel adicionar valor abaixo de 0");
            }

            if (opçao > 4 || opçao <= 0) {
                System.out.println("opçao invalida");
            }
        }
    }
}


