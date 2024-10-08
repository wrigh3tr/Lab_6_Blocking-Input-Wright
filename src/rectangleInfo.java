import java.util.Scanner;
public class rectangleInfo {
    public static void main(String[] args) {
        double side1 = 0;
        double side2 = 0;
        double area = 0;
        double hypotenuse = 0;
        boolean doneSide1 = false;
        boolean doneSide2 = false;
        String trash = "";

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter one side of the rectangle: ");

        if (input.hasNextDouble()) {
            side1 = input.nextDouble();
            input.nextLine();
            doneSide1 = true;
        }
        else
         {
             System.out.println("Please enter a Valid Input: ");
             trash = input.nextLine();
         }
        }while(!doneSide1);


        do
        {
            System.out.println("Enter the other side of the rectangle: ");

            if (input.hasNextDouble()) {
                side2 = input.nextDouble();
                doneSide2 = true;
            } else {

                System.out.println("Please enter a Valid Input: ");
                trash = input.nextLine();
            }
        }while(!doneSide2);

        area = side1 * side2;
        side1 = side1 * side1;
        side2 = side2 * side2;
        hypotenuse = side1 + side2;
        hypotenuse = Math.sqrt(hypotenuse);

        System.out.println("The area of the rectangle is " + area);
        System.out.println("Your rectangles hypotenuse is " + hypotenuse);

        

    }
}
