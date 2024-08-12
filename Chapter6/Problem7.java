/*
Write a program to find the minimum element in a java array
 */

package Chapter6;

public class Problem7 {
    public static void main(String[] args) {
        int[] nums = {12, 9, 89, 75, 1, 36, 45};
        int temp = nums[0];

        for (int i = 0; i < nums.length; i++){
            if(temp>nums[i]){
                temp = nums[i];
            }
        }
        System.out.println(temp);
    }
}