package Chapter4;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class RockPaperScissors {
    public static void main(String[] args){

        System.out.println("0 = Rock ");
        System.out.println("1 = Paper ");
        System.out.println("2 = Scissors ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your move : ");
        int userRPS = sc.nextInt();

        Random randomNumber = new Random();
        int systemRPS = randomNumber.nextInt(3);
        System.out.println("Move played by system: "+systemRPS);

        if(userRPS == 0 && systemRPS == 1){
            System.out.println("You lost!");
        }
        else if(userRPS == 1 && systemRPS == 2){
            System.out.println("You lost!");
        }
        else if(userRPS == 2 && systemRPS == 0){
            System.out.println("You lost!");
        }
        else if (userRPS == systemRPS){
            System.out.println("Its a tie!");
        }
        else {
            System.out.println("You won!");
        }

    }
}
