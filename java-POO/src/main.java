import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<ContasBancarias> contas = new ArrayList<>();

        cadastrarContas(contas,"Pedro", 100, 500);
        cadastrarContas(contas, "Venus", 101, 800);

        realizarPix(contas, 100, 101,   700);


    }

    public static void cadastrarContas(
            ArrayList<ContasBancarias> contas,
            String nome,
            int numeroconta,
            double saldo){

        if(buscarConta(contas, numeroconta) == null ) {
            try {
                ContasBancarias conta1 =
                        new ContasBancarias(nome, numeroconta, saldo);
                contas.add(conta1);
                System.out.println("Conta Criada");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }else{
            System.out.println("Numero ja cadastrado! ");
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

    public static ContasBancarias buscarConta(
            ArrayList<ContasBancarias> contas,
            int numeroBusca){

        boolean encontrou = false;

        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getNumeroConta() == numeroBusca){
                return contas.get(i);
            }
        }
        return null;
    }

    public static void realizarPix(
            ArrayList<ContasBancarias> contas,
            int numOrigem,
            int numDestino,
            double valor){

        ContasBancarias origem = buscarConta(contas, numOrigem);
        ContasBancarias destino = buscarConta(contas, numDestino);

        if(origem != null && destino != null) {
            if (origem != destino) {
                if (valor > 0 && origem.getSaldo() >= valor) {
                    origem.pix(destino, valor);
                    System.out.println("Seu pix foi realizado no valor : " + valor);
                } else {
                    System.out.println("PIX invalido! Verifique o valor e o saldo disponivel");
                }
            }else {
                System.out.println("Nao pode fazer pix para a mesma conta");
            }
        }else{
            System.out.println("Uma das contas nao encontrada");
        }
    }
}


