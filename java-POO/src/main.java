public class main {
    public static void main(String[] args) {

        gerenciadorContas banco1 = new gerenciadorContas();

        banco1.cadastrarContas("Pedro", 100, 600);
        banco1.cadastrarContas("Venus", 101, 900);
        banco1.cadastrarContas("Rapha", 102, 1000);

        banco1.listarContas();

    }
}


