package Chapter6;

public class PrintReverseArray {
    public static void main(String[] args) {
        int[] WholeNumber = {1,2,3,4,5,6,7,8,9,10};

        for (int i = WholeNumber.length-1; i>=0; i--){
            System.out.println(WholeNumber[i]);
        }
    }
}
