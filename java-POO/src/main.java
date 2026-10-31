import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<ContasBancarias> contas = new ArrayList<>();

        cadastrarContas(contas,"Pedro", 100, 500);
        cadastrarContas(contas, "Venus", 101, 500);

        listarContas(contas);


    }

    public static void cadastrarContas(
            ArrayList<ContasBancarias> contas,
            String nome,
            int numeroconta,
            double saldo){
        try{
            ContasBancarias conta1 =
                    new ContasBancarias(nome, numeroconta, saldo);
            contas.add(conta1);
            System.out.println("Conta Criada");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void listarContas(ArrayList<ContasBancarias> contas){

        if (contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada");
        }else {
            for (int i = 0; i < contas.size(); i++) {
                System.out.println(contas.get(i).getTitular());
                System.out.println(contas.get(i).getNumeroConta());
                System.out.println(contas.get(i).getSaldo());
            }
        }
    }
}


