import java.util.Scanner;

public class codigo10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double saldo = 2000;

        while(opcao != 3 ){
            System.out.println("1 - Menu");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Sair");

            System.out.println("Escolha: ");
            opcao = scanner.nextInt();
        if (opcao == 2) {
            System.out.println(saldo);
            }
        }
        System.out.println("Obrigado por usar o banco");
    }

}
