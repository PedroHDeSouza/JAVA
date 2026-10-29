public class ContasBancarias {
    String titular;
    int numeroConta;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saque invalido");
        }
    }

    public void pix(ContasBancarias destino, double valor){
        if(valor > 0 && valor <= saldo){
            sacar(valor);
            destino.depositar(valor);
        }else{
            System.out.println("transferencia invalida");
        }
    }
}

