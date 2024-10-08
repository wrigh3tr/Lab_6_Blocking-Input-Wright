import java.util.Scanner;
public class fuelCosts {
    public static void main(String[] args)
    {
        double gallons = 0;
        double MPG = 0;
        double fullTank = 0;
        double gasCost = 0;
        double drive = 0;
        double HundredMilesCost = 0;
        boolean doneMPG = false;
        boolean doneGallons = false;
        boolean doneCost = false;
        String trash ="";

        Scanner input = new Scanner(System.in);



            do
            {
                System.out.print("What is the Capacity of your Tank (gallons)? ");

                if (input.hasNextDouble()) {
                    gallons = input.nextDouble();
                    trash = input.nextLine();
                    doneGallons = true;
                }
                else {
                    trash = input.nextLine();
                    System.out.println("Please enter a Valid Input: ");
                }
            }
            while (!doneGallons) ;


            do {
                System.out.print("How many Miles per Gallon does your Car get? ");


                if (input.hasNextDouble()) {
                    MPG = input.nextDouble();
                    input.nextLine();
                    doneMPG = true;
                } else {
                    trash = input.nextLine();
                    System.out.println("Please enter a Valid Input ");

                }
            }while(!doneMPG);

            do {
            System.out.print("How much is gas per gallon? ");


            if (input.hasNextDouble()) {
                gasCost = input.nextDouble();
                input.nextLine();
                doneCost = true;
            } else {
                trash = input.nextLine();
                System.out.println("Please enter a Valid Input ");

            }
        }while(!doneCost);

            drive = 100/ MPG;
            HundredMilesCost = drive * gasCost;
            System.out.println("The Cost to Drive 100 Miles is $" + HundredMilesCost);

            fullTank = gallons * MPG;
        System.out.println("You can Drive " + fullTank + " miles on a full tank of Gas");

    }
}