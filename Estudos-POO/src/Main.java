public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Venûs";
        conta1.numeroConta = 1001;
        conta1.saldo = 900;

        ContaBancaria conta2 = new ContaBancaria();

        conta2.titular = "pedro";
        conta2.saldo = 2000;
        conta2.numeroConta = 1002;

        System.out.println(conta1.titular);
        System.out.println(conta1.numeroConta);
        System.out.println(conta1.saldo);

        System.out.println(conta2.titular);
        System.out.println(conta2.numeroConta);
        System.out.println(conta2.saldo);

    }
}
