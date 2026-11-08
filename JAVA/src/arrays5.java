public class arrays5 {
    public static void main(String[] args){

        int[] numeros = {35, 12, 78, 4, 91, 23};
        int menorNum = numeros[0];
        int maiorNum = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if(numeros[i] < menorNum){
                menorNum = numeros[i];
            }
            if(numeros[i] > maiorNum){
                maiorNum = numeros[i];
            }

        }
        System.out.println("seu maior numero é: "+ maiorNum);
        System.out.println("seu menor numeor é: " +menorNum);
    }
}
