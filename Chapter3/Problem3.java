/*
Write a java program to fill in letter template which looks like below:
letter = "Dear <|name|>, Thanks a lot"
Replace <|name|> With a user input name
 */

package Chapter3;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();

        System.out.println(letter.replace("<|name|>", name));
    }
}
