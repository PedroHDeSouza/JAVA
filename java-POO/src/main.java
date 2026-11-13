import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opçao = -1;

        gerenciadorContas banco1 = new gerenciadorContas();
        MenuInterativo menu = new MenuInterativo();

        while (opçao != 0) {
            menu.mostraMenu();

            System.out.println("Escolha sua opçao: ");
            opçao = sc.nextInt();
            sc.nextLine();

            switch (opçao) {
                case 1:
                    System.out.println("Cadastro selecionado");

                    System.out.println("Nome do titular: ");
                    String nome = sc.nextLine();

                    System.out.println("Numero da conta: ");
                    int numeroConta = sc.nextInt();

                    System.out.println("Saldo inicial: ");
                    double saldo = sc.nextDouble();

                    banco1.cadastrarContas(nome, numeroConta, saldo);
                    break;

                case 2:
                    System.out.println("Busca selecionada");

                    System.out.println("Numero da conta para busca: ");
                    int numeroBusca = sc.nextInt();

                    ContasBancarias contaEncontrada = banco1.buscarContas(numeroBusca);

                    if(contaEncontrada != null){
                        System.out.println(contaEncontrada.getTitular());
                        System.out.println(contaEncontrada.getNumeroConta());
                        System.out.println(contaEncontrada.getSaldo());
                    }else{
                        System.out.println("Conta nao encontrada");
                    }
                    break;

                case 3:
                    System.out.println("Listagem selecionada");

                    banco1.listarContas();
                    break;

                case 4:
                    System.out.println("Pix selecionado");

                    System.out.println("Numero da conta que ira mandar o PIX: ");
                    int numOrigem = sc.nextInt();

                    System.out.println("Numero da conta que ira receber o PIX: ");
                    int numDestino = sc.nextInt();

                    System.out.println("Valor da trasnferencia: ");
                    double valor = sc.nextDouble();

                    banco1.realizarPix(numOrigem, numDestino, valor);

                    break;

                case 5:
                    System.out.println("Deposito selecionado");
                    System.out.println("Qual conta para deposito: ");
                    int numeroContaDeposito = sc.nextInt();

                    ContasBancarias contaDeposito = banco1.buscarContas(numeroContaDeposito);

                    if (contaDeposito != null){

                        System.out.println("Valor para deposito: ");
                        double valorDeposito = sc.nextDouble();

                        boolean depositoRealizado = contaDeposito.depositar(valorDeposito);

                        if(depositoRealizado){
                            System.out.println("Deposito realizado");
                        }else{
                            System.out.println("Deposito negado!");
                        }

                    }else{
                        System.out.println("Conta nao encontrada");
                    }
                    break;

                case 6:
                    System.out.println("Saque selecionado");

                    System.out.println("Qual a conta para o saque: ");
                    int numeroContaSaque = sc.nextInt();

                    ContasBancarias contaSaque = banco1.buscarContas(numeroContaSaque);


                    if(contaSaque != null){

                        System.out.println("Valor para saque: ");
                        double valorSaque = sc.nextDouble();

                        boolean saqueRealizado = contaSaque.sacar(valorSaque);

                        if(saqueRealizado){
                            System.out.println("Saque realizado");
                        }else{
                            System.out.println("Saque invalido!");
                        }

                    }else{
                        System.out.println("Conta nao encontrada:");
                    }
                    break;

                case 0:
                    System.out.println("Encerando sistema...");
                    break;

                default:
                    System.out.println("opçao invalida!");
            }
        }

    }
}


