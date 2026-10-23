import java.util.Scanner;

public class SistemaBanco3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] contas = new int[3];
        String[] clientes = new String[3];
        double[] saldos = new double[3];
        double deposito = 0;

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

        System.out.println("digite o numero da sua conta: ");
        int buscaConta = scanner.nextInt();

        boolean encontrou = false;

        for(int i = 0;i < contas.length; i++){

            if(buscaConta == contas[i]){
                System.out.println(clientes[i]);
                System.out.println(saldos[i]);

                encontrou = true;

                System.out.println("qual seu deposito: ");
                deposito = scanner.nextDouble();

                if (deposito > 0){
                    saldos[i] = saldos[i] + deposito;

                    System.out.println("seu saldo atual é: "+saldos[i]);
                }else{
                    System.out.println("Deposito invalido para deposito");
                }

            }
        }

        if(!encontrou){
            System.out.println("conta nao encontrada!");
        }

    }
}
