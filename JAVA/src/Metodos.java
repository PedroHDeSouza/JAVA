public class Metodos {
    public static void main(String[] args) {
        double saldo = 500;

        saldo = depositar(saldo, 300);
        saldo = depositar(saldo, 200);

        System.out.println(saldo);
    }

    public static double depositar(double saldo, double valor) {
        return saldo + valor;
    }
}