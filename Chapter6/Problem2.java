/*
Write a program to find out whether a given integer is present in an array or not
 */

package Chapter6;

import javax.swing.*;

public class Problem2 {
    public static void main(String[] args) {
        int num = 252;
        boolean isInArray = false;
        int[] array = {12, 23, 45, 56, 22, 96, 71};
        for (int i = 0; i < array.length; i++){
            if(array[i] == num){
                isInArray = true;
                break;
            }
        }
        if(isInArray == true){
            System.out.println("The number is present in the array");
        }
        else {
            System.out.println("The number is not present");
        }
    }
}
