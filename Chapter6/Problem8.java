/*
Write a java program to find whether an array is sorted or not
 */

package Chapter6;

public class Problem8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,8,5};
        boolean sortedArray = true;

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i + 1]){
                sortedArray = false;
                break;
            }
        }
        if (sortedArray){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

    }
}
