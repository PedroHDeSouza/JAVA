public class ContasBancarias {
    private String titular;
    private int numeroConta;
    private double saldo;

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

    public ContasBancarias(String nome, int numero, double saldoInicial) {

        if(saldoInicial >= 0){
            saldo = saldoInicial;
        }else{
            throw new IllegalArgumentException("Saldo invalido!");
        }

        if(nome != null && !nome.isBlank()){
            titular = nome;
        }else{
            throw new IllegalArgumentException("Nome invalido!");
        }

        if (numero > 0) {
            numeroConta = numero;
        } else {
            throw new IllegalArgumentException("Número de conta inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}

