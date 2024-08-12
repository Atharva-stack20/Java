/*
Write a java program to reverse an array
 */

package Chapter6;

//public class Problem5 {
//    public static void main(String[] args) {
//        int[] array = {1, 3, 4, 8, 9, 11};
//
//        System.out.println("Array in reverse order: ");
//        for (int i = array.length-1; i>=0; i--){
//            System.out.print(array[i]+" ");
//        }
//    }
//}


public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 3, 78, 56, 14};
        int len = arr.length;
        int n = Math.floorDiv(len, 2); // Divide the length of an array by 2 and return the floor value of division
        int temp;

        // This loop will run 3 times as value of n is 6/2 = 3
        for (int i = 0; i < n; i++){
            temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }

        System.out.println("Array in reverse order: ");

        for (int element: arr){
            System.out.print(element + " ");
        }
    }
}