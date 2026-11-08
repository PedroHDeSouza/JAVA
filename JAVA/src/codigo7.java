import java.util.Scanner;

public class codigo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Banco ti----");

        System.out.println("Digite sua idade:");
        int nome = scanner.nextInt();
        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();

        if (nome >= 18 && salario >= 2000){
            System.out.println("Credito disponivel para analise");
        } else{
            System.out.println("Voce nao atende os requisistos");
        }
    }
}
