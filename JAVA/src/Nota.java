import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double media = 0;
        double maiorNota = 0;
        double menorNota = 10;
        int erro = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a nota " + i + ": ");
            double numero = scanner.nextDouble();

            while (numero < 0 || numero > 10){
                erro++;
                System.out.println("nota invalida");
                numero = scanner.nextDouble();
            }
            System.out.println("nota aceita");

            media = media + numero;

            if (numero > maiorNota) {
                maiorNota = numero;
            }
            if (numero > 0 && numero < menorNota){
                menorNota = numero;
            }
        }

        media = media / 4;

        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        if (erro == 0){
            System.out.println("voce acertou sem erros");
        }else {
            System.out.println("infelizmente nao ficou perfeito");
        }

        System.out.println("Sua maior nota foi: " + maiorNota);
        System.out.println("Sua menor nota foi " + menorNota);
        System.out.println("voce errou: "+ erro + " vezes");

        scanner.close();
    }
}