import java.util.ArrayList;

public class gerenciadorContas {

    private ArrayList<ContasBancarias> contas = new ArrayList<>();

    public ContasBancarias buscarContas(int numeroBusca){

        for(int i = 0; i < contas.size(); i++){

            if(contas.get(i).getNumeroConta() == numeroBusca){
                return contas.get(i);
            }
        }
        return null;
    }

    public void cadastrarContas(String nome, int numeroConta,double saldo){

        if(buscarContas(numeroConta) == null ) {
            try {
                ContasBancarias conta1 =
                        new ContasBancarias(nome, numeroConta, saldo);
                contas.add(conta1);
                System.out.println("Conta Criada");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }else{
            System.out.println("Numero ja cadastrado! ");
        }
    }

    public void listarContas(){

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

    public void realizarPix(
            int numOrigem,
            int numDestino,
            double valor) {

        ContasBancarias origem = buscarContas(numOrigem);
        ContasBancarias destino = buscarContas(numDestino);

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
