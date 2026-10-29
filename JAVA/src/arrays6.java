import java.util.Scanner;

public class arrays6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("digite o numero " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }


        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
