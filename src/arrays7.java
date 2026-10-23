public class arrays7 {
    public static void main(String[] args){

        int[] numeros = {12, 7, 9, 20, 35, 42, 8};
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < numeros.length; i++){

            if (numeros[i] % 2 == 0){
                System.out.println("seu numero é par: " + numeros[i]);
                pares++;
            }else {
                System.out.println("seu numero é impar: " + numeros[i]);
                impares++;
            }

        }
        System.out.println("voce tem: " +pares+ " numeros pares");
        System.out.println("Voce tem: " +impares+ " numeros impares");

    }
}
