public class main {
    public static void main(String[] args) {
        ContasBancarias conta1 = new ContasBancarias();

        conta1.titular = "Pedro";
        conta1.numeroConta = 1001;
        conta1.saldo = 500;

        ContasBancarias conta2 = new ContasBancarias();

        conta2.titular = "venus";
        conta2.numeroConta = 1002;
        conta2.saldo = 1000;

        conta1.pix(conta2, 200);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

    }
}

