import java.util.Scanner;

public class codigo6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Banco ti");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu saldo: ");
        int saldo = scanner.nextInt();
        System.out.println("Digite o valor do saque: ");
        int saque = scanner.nextInt();

        if(saldo >= saque){
            int saldoAtual = saldo - saque;
            System.out.println("Saldo atual: " + saldoAtual);
        }else {System.out.println("Saldo insuficiente");
        }

    }
}
