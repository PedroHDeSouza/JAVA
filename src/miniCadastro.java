import java.util.Scanner;

public class miniCadastro {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] clientes = new String[3];

        for(int i= 0; i < clientes.length; i++){
            System.out.println("escreva seu nome de usuario " + (i + 1) +": ");
            clientes[i] = scanner.nextLine();
        }

        for (int i = 0; i < clientes.length; i++){
            System.out.println(clientes[i]);
        }

    }
}
