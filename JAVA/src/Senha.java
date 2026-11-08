import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativa = 0;
        int senha = 0;

        while (senha != 1234 && tentativa < 3) {
            System.out.println("Digite sua senha:");
            senha = scanner.nextInt();
            if (senha == 1234) {
                System.out.println("Senha correta!");
            } else {
                System.out.println("Senha incorreta");
                tentativa++;
                System.out.println("Voce errou" + tentativa);
            }
            if (tentativa == 3) {
                System.out.println("Acesso bloqueado!");
            } else {
                System.out.println("Login realizado com sucesso!");
            }
        }
    }
}