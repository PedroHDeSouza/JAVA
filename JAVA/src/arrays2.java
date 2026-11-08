public class arrays2 {
    public static void main(String[] args){

        int[] vetores = {4, 8, 12, 16, 20};
        int soma = 0;

        for (int i = 0; i < vetores.length; i++){
            soma = soma + vetores[i];

        }
        System.out.println(soma);
    }
}
