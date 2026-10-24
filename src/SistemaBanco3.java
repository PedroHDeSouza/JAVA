import java.util.Scanner;

public class SistemaBanco3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] contas = new int[3];
        String[] clientes = new String[3];
        double[] saldos = new double[3];
        double deposito = 0;
        int opcao = -1;
        boolean cadastroRealizado = false;


        while(opcao != 0){

            System.out.println("===BANCO 2.0===");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Consultar conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Listar contas (opçao dev)");
            System.out.println("0 - Sair");

            System.out.println("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                //METODO DE CADASTRO
                case 1:
                    System.out.println("Cadastro selecionado!");

                    if(!cadastroRealizado) {

                        System.out.println("--Cadastro Banco--");

                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println("Escreva seu nome para cadastro: ");
                            clientes[i] = sc.nextLine();

                            System.out.println("Escreva seu numero da conta: ");
                            contas[i] = sc.nextInt();

                            System.out.println("Escreva seu saldo: ");
                            saldos[i] = sc.nextDouble();
                            sc.nextLine();

                            cadastroRealizado = true;

                        }
                    }else{
                        System.out.println("Contas ja cadastradas!");
                    }
                    break;

                //METODO DE CONSULTAR
                case 2:
                    System.out.println("Consultar contas selecionado!");

                    if(cadastroRealizado) {

                        System.out.println("digite o numero da sua conta: ");
                        int buscaConta = sc.nextInt();

                        boolean encontrou = false;

                        for (int i = 0; i < contas.length; i++) {

                            if (buscaConta == contas[i]) {
                                System.out.println(clientes[i]);
                                System.out.println(saldos[i]);

                                encontrou = true;
                            }
                        }
                        if (!encontrou) {
                            System.out.println("conta nao encontrada!");
                        }
                    }else{
                        System.out.println("Cadastre sua conta primeiro!");
                    }
                    break;

                case 3:
                    if(cadastroRealizado) {
                        System.out.println("Deposito selecionado!");

                        System.out.println("digite o numero da sua conta: ");
                        int buscaConta = sc.nextInt();

                        boolean encontrou = false;

                            for (int i = 0; i < contas.length; i++) {
                                if (buscaConta == contas[i]) {
                                    encontrou = true;

                                    System.out.println("Seu saldo atual é: " + saldos[i]);

                                    System.out.println("qual o valor do deposito:");
                                    deposito = sc.nextDouble();

                                    if (deposito > 0) {
                                        saldos[i] = saldos[i] + deposito;
                                        System.out.println("Seu saldo atual é: " + saldos[i]);
                                    } else {
                                        System.out.println("Valor de deposito invalido!");
                                    }
                                }
                            }
                        if (!encontrou) {
                            System.out.println("Conta nao encontrada");
                        }
                    }else{
                        System.out.println("Nao existem contas cadastradas!");
                    }
                    break;

                case 4:
                    System.out.println("Saque selecionado!");
                    break;

                case 5:
                    if(cadastroRealizado) {
                        System.out.println("Lista de contas selecionada!");

                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println("cliente: " + clientes[i]);
                            System.out.println("Conta: " + contas[i]);
                            System.out.println("Saldo: " + saldos[i]);
                        }
                    }else{
                        System.out.println("Nao existem contas cadastradas!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando!!!");
                    break;

                default:
                    System.out.println("Opçao invalida! Digite uma das opçoes");
            }
        }



    }
}
