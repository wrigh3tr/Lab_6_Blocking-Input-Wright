
import java.util.Scanner;
import java.util.Random;
public class highOrLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int usernum = 0;
        boolean doneRandom= false;
        do {
            System.out.println("Enter a Number[1-10]: " );
            usernum = input.nextInt();
            int rndNum = rnd.nextInt(10) + 1;


            if(usernum <= 10 )
             {
                 if (rndNum == usernum) {
                     System.out.println("You have entered the number");
                     doneRandom = true;
                 } else if (rndNum > usernum) {
                     System.out.println("You have entered a number less than the random number");
                     doneRandom = true;
                 } else if (rndNum < usernum) {

                     System.out.println("You have entered a number greater than the random number");
                     doneRandom = true;
                 }
             }
             else
             {
                 System.out.println("Enter a Valid Input");
             }



        }while(!doneRandom);


    }
}

