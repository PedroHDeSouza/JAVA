import java.util.Scanner;

public class aprendendoFOR {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        /*for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Fim");*/

        /*for(int i = 2; i <= 20; i+=2 ){
            System.out.println(i);
        }*/

        /*int contador = 0;

        for (int i = 2; i <=20; i+=2) {
            contador++;
        }

        System.out.println(contador);*/

        /*int cont = 0;

        for (int i = 1; i <= 20; i++){
            if(i > 15){
                System.out.println(i);
                cont++;
            }
        }
        System.out.println(cont);*/


        /*int soma =0;

        for (int i = 1; i <=50; i++){
            System.out.println(i);
            if (i % 3 == 0 && i % 5 ==0){
                soma= soma + i;
            }
        }
        System.out.println(soma);*/

        /*int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            soma = soma + numero;
        }

        System.out.println("Soma total: " + soma);*/


        double media = 0;
        double maiorNota = 0;

        for (int i = 1; i <= 4; i++){
            System.out.println("Digite um numero: ");
            double numero = scanner.nextDouble();

            media = media + numero;

            if (numero > maiorNota){
                maiorNota = numero;
            }
        }

        media = media / 4;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >=5) {
            System.out.println("Recuperaçao");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("sua maior nota foi : "+ maiorNota);

    }
}