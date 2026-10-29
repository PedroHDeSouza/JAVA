import java.util.Scanner;

public class codigo8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Banco ti----");

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Voce é cliente VIP? (true/false)");
        boolean VIP = scanner.nextBoolean();

        if (idade >= 60 || VIP){
            System.out.println("atendimento especial");
        }else{
            System.out.println("Atendimento normal");
        }

    }
}
