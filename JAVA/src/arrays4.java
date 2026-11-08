public class arrays4 {
    public static void main(String[] args){

        int[] numeros = {14, 32, 7, 89, 23, 51};
        int maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }

        System.out.println("seu maior numero é: "+maiorNumero);

    }
}
