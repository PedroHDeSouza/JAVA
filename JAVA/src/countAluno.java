import java.util.Scanner;

public class countAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int erros = 0;

        for (int i = 1; i <= 3; i++){
            System.out.println("digite sua media:");
            double media = scanner.nextDouble();

            while (media < 0 || media > 10){
                System.out.println("media errada, digite novamente");
                media = scanner.nextDouble();
                erros++;
            }

            if(media >= 7){
                aprovados++;
            }else{
                reprovados++;
            }
        }
        System.out.println("foram aprovados "+ aprovados + " Alunos e:" + reprovados + " reprovados");
        System.out.println("voce errou esse tanto de vezes: " + erros);
    }
}
