public class ContaPoupanca extends ContasBancarias{

    private double taxaRendimento;

    public ContaPoupanca(String nome, int numero, double saldoInicial, double taxaRendimento){
        super(nome, numero, saldoInicial);

        this.taxaRendimento = taxaRendimento;

    }
    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}
