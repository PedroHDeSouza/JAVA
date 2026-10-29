import java.util.Scanner;

public class codigo9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        int password = scanner.nextInt();

        while (password != 1234){
            System.out.println("Senha incorreta");
            password = scanner.nextInt();

        }
        System.out.println("Senha correta");
    }
}
