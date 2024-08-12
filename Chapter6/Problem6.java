/*
Write a program to find the maximum element in a java array
 */

package Chapter6;

public class Problem6 {
    public static void main(String[] args) {
        int[] nums = {12, 9, 89, 75, 1, 36, 45};
        int temp = 0;
        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++){
            if(temp<nums[i]){
                temp = nums[i];
            }
        }
        System.out.println(temp);
    }
}
