import java.util.Scanner;

public class SistemaBanco3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] contas = new int[3];
        String[] clientes = new String[3];
        double[] saldo = new double[3];
        int opcao = -1;
        boolean cadastroRealizado = false;

        while (opcao != 0) {

            mostrarMenu();

            System.out.println("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                //METODO DE CADASTRO
                case 1:
                    System.out.println("Cadastro selecionado!");

                    if (!cadastroRealizado) {

                        cadastrarContas(sc, clientes, contas, saldo);

                        cadastroRealizado = true;

                    } else {
                        System.out.println("Contas ja cadastradas!");
                    }
                    break;

                //METODO DE CONSULTAR
                case 2:
                    System.out.println("Consultar contas selecionado!");

                    if (cadastroRealizado) {

                        consultarContas(sc, clientes, contas, saldo);

                    } else {
                        System.out.println("Cadastre sua conta primeiro!");
                    }
                    break;

                //DEPOSITO
                case 3:
                    if (cadastroRealizado) {
                        System.out.println("Deposito selecionado!");

                        depositar(sc, contas, saldo);

                    } else {
                        System.out.println("Nao existem contas cadastradas!");
                    }
                    break;

                //SAQUE
                case 4:
                    if (cadastroRealizado) {
                        System.out.println("Saque selecionado!");

                        saque(sc, contas, saldo);

                    } else {
                        System.out.println("Nao existem contas cadastradas!");
                    }
                    break;

                case 5:
                    if (cadastroRealizado) {
                        System.out.println("Lista de contas selecionada!");

                        listarContas(clientes, contas, saldo);

                    } else {
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

    public static void mostrarMenu() {
        System.out.println("=== BANCO 2.0 ===");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Consultar conta");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Listar contas");
        System.out.println("0 - Sair");
    }

    public static void mostrarSaldo(double saldo) {
        System.out.println("Seu saldo atual é : " + saldo);
    }

    public static double calcularDeposito(double saldo, double deposito) {
        return saldo + deposito;
    }

    public static double calcularSaque(double saldo, double saque) {
        if (saque > 0 && saque <= saldo) {
            return saldo - saque;
        } else {
            System.out.println("Saque inválido!");
            return saldo;
        }
    }

    public static void listarContas(
            String[] clientes,
            int[] contas,
            double[] saldo) {

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("cliente: " + clientes[i]);
            System.out.println("Conta: " + contas[i]);
            System.out.println("Saldo: " + saldo[i]);
        }
    }

    public static void consultarContas(
            Scanner sc,
            String[] clientes,
            int[] contas,
            double[] saldo) {

        System.out.println("digite o numero da sua conta: ");
        int buscaConta = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < contas.length; i++) {

            if (buscaConta == contas[i]) {
                encontrou = true;

                System.out.println(clientes[i]);
                mostrarSaldo(saldo[i]);
            }
        }
        if (!encontrou) {
            System.out.println("conta nao encontrada!");
        }

    }

    public static void depositar(
            Scanner sc,
            int[] contas,
            double[] saldo) {

        System.out.println("digite o numero da sua conta: ");
        int buscaConta = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < contas.length; i++) {
            if (buscaConta == contas[i]) {
                encontrou = true;

                mostrarSaldo(saldo[i]);

                System.out.println("qual o valor do deposito:");
                double deposito = sc.nextDouble();

                if (deposito > 0) {
                    saldo[i] = calcularDeposito(saldo[i], deposito);
                    mostrarSaldo(saldo[i]);
                } else {
                    System.out.println("Valor de deposito invalido!");
                }
            }
        }
        if (!encontrou) {
            System.out.println("Conta nao encontrada");
        }
    }

    public static void saque(
            Scanner sc,
            int[] contas,
            double[] saldo) {

        System.out.println("digite o numero da sua conta: ");
        int buscaConta = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < contas.length; i++) {
            if (buscaConta == contas[i]) {
                encontrou = true;

                mostrarSaldo(saldo[i]);

                System.out.println("Qual o valor do saque?");
                double saque = sc.nextDouble();

                saldo[i] = calcularSaque(saldo[i], saque);

                mostrarSaldo(saldo[i]);
            }
        }
        if (!encontrou) {
            System.out.println("Conta nao encontrada");
        }

    }

    public static void cadastrarContas(
            Scanner sc,
            String[] clientes,
            int[] contas,
            double[] saldo) {

        System.out.println("--Cadastro Banco--");

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Escreva seu nome para cadastro: ");
            clientes[i] = sc.nextLine();

            System.out.println("Escreva seu numero da conta: ");
            contas[i] = sc.nextInt();

            System.out.println("Escreva seu saldo: ");
            saldo[i] = sc.nextDouble();
            sc.nextLine();


        }
    }
}
