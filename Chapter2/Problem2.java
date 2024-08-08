/*
Write a java program to encrypt a grade by adding 8 to it.
Decrypt it to show the correct grade
 */

package Chapter2;

public class Problem2{
    public static void main(String[] args) {
        char grade = 'B';

        //Type casting
        grade = (char)(grade + 8);
        System.out.println("Encrypted Grade - "+grade);

        grade = (char)(grade - 8);
        System.out.println("Decrypted Grade - "+grade);
    }
}
