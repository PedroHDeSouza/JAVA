import java.util.Scanner;

public class SistemaBanco3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] contas = new int[3];
        String[] clientes = new String[3];
        double[] saldos = new double[3];

        System.out.println("--Cadastro Banco--");

        for(int i = 0; i < clientes.length; i++){
            System.out.println("Escreva seu nome para cadastro: ");
            clientes[i] = scanner.nextLine();

            System.out.println("Escreva seu numero da conta: ");
            contas[i] = scanner.nextInt();

            System.out.println("Escreva seu saldo: ");
            saldos[i] = scanner.nextDouble();
            scanner.nextLine();

        }

        System.out.println("Contas Cadastradas");

        for(int i = 0; i < clientes.length; i++){
            System.out.println("cliente: "+ clientes[i]);
            System.out.println("Conta: " + contas[i]);
            System.out.println("Saldo: " + saldos[i]);
        }
    }
}
