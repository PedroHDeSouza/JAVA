import java.util.Scanner;

public class MiniATM2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int opcao = 0;
        double saldo = 1000;


        while(opcao != 4){

            MostrarMenu();
            opcao = scanner.nextInt();


            //SALDO
            if(opcao == 1){
                System.out.println("este é seu saldo atual: "+ saldo);
            }

            //SACAR
            if(opcao == 2){
                double valor = 0;
                System.out.println("quanto voce quer sacar: ");
                valor = scanner.nextInt();
                saldo = sacar(saldo,valor);
                System.out.println(saldo);
            }

            //DEPOSITO
            if(opcao == 3){
                double valor = 0;
                System.out.println("quanto voce quer depositar: ");
                valor = scanner.nextInt();

                saldo = depositar(saldo,valor);
                System.out.println(saldo);
            }

            if (opcao > 4 || opcao <= 0){
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

    public static double sacar(double saldo, double valor){
        if(saldo > 0 && valor <= saldo){
            return saldo - valor;
        }else{
            System.out.println("saque invalido");
            return saldo;
        }
    }

    public static double depositar(double saldo, double valor){
        if (valor > 0){
            saldo = saldo + valor;
            return saldo;
        }else {
            System.out.println("Voce nao pode colocar saldo negativo");
            return saldo;
        }
    }
}
