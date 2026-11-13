public class ContasBancarias {
    private String titular;
    private int numeroConta;
    private double saldo;

    public boolean depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean pix(ContasBancarias destino, double valor){
        if(destino == null || destino == this){
            return false;
        }
        if(valor > 0 && valor <= saldo){
            boolean saqueRealizado = sacar(valor);
            if(!saqueRealizado){
                return false;
            }
            boolean depositoRealizado = destino.depositar(valor);
            if(!depositoRealizado){
                depositar(valor);
                return false;
            }
            return true;
        }
        return false;
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