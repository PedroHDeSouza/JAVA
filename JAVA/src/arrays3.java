public class arrays3 {
    public static void main(String[] args){

        int[] vetores = {12, 5, 8, 21, 4, 15};
        int num = 0;

        for(int i = 0; i < vetores.length; i++){
            if (vetores[i] > 10){
                num++;
            }
        }
        System.out.println("existem: "+num+ " maiores q 10");
    }
}
