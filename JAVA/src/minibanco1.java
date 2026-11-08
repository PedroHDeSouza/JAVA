import java.util.Scanner;

public class minibanco1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Banco ti----");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        int saldo = scanner.nextInt();
        System.out.println("Valor do saque");
        int saque = scanner.nextInt();


        if (idade < 18){
            System.out.println("Operaçao nao permitida: Cliente menor de idade.");
        } else if (saldo >= saque) {
            int novo_saldo = saldo - saque;
            System.out.println("Saque realizado");
            System.out.println("Novo saldo: " +  novo_saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
