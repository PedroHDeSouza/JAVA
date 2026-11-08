import java.util.Scanner;

public class MiniATM2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int opcao = 0;
        double saldo = 1000;


        while(opcao != 4){

            MostrarMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                //SALDO
                case 1:
                    System.out.println("este é seu saldo atual: " + saldo);
                    break;

                //SACAR
                case 2:
                    double valorSaque = 0;
                    System.out.println("quanto voce quer sacar: ");
                    valorSaque = scanner.nextDouble();
                    saldo = sacar(saldo, valorSaque);
                    System.out.println(saldo);
                    break;

                //DEPOSITO
                case 3:
                    double valorDeposito = 0;
                    System.out.println("quanto voce quer depositar: ");
                    valorDeposito = scanner.nextDouble();

                    saldo = depositar(saldo, valorDeposito);
                    System.out.println(saldo);
                    break;

                case 4:
                    System.out.println("Saindo do banco");
                    break;

                default:
                    System.out.println("opçao invalida");
            }
        }
    }

    public static void MostrarMenu(){

        System.out.println("---BancoTI---");

        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");

        System.out.println("Escolha uma opçao: ");

    }

    public static boolean podeDepositar(double valor){
        return valor > 0;
    }

    public static boolean podeSacar(double saldo, double valor){
        return valor > 0 && valor <= saldo;
    }

    public static double sacar(double saldo, double valor){
        if (podeSacar(saldo,valor)){
            System.out.println("Saque aprovado");
            return saldo - valor;
        }else{
            System.out.println("Saque recusado");
            return saldo;
        }
    }

    public static double depositar(double saldo, double valor){
        if (podeDepositar(valor)){
            System.out.println("deposito aprovado!");
            return saldo + valor;
        }else{
            System.out.println("Deposito recusado");
            return saldo;
        }
    }
}
