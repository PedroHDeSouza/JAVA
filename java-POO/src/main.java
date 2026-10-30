public class main {
    public static void main(String[] args) {

        cadastrarContas("Pedro", 100, 500);

    }

    public static void cadastrarContas(String nome, int numeroconta, double saldo){
        try{
            ContasBancarias conta1 =
                    new ContasBancarias(nome, numeroconta, saldo);
            System.out.println("Conta Criada");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

