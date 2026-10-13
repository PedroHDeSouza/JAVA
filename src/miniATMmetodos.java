public class miniATMmetodos {
    public static void main(String[] args){

        double saldo = 1000;

        saldo = depositar(saldo, 500);
        saldo = sacar(saldo,200);

        System.out.println(saldo);

    }


    public static double depositar(double saldo, double valor){
        return saldo + valor;
    }

    public static double sacar(double saldo, double valor){
        if (saldo > 0 && valor <= saldo){
            return saldo - valor;
        }else {
            System.out.println("saque invalido");
            return saldo;
        }
    }
}
