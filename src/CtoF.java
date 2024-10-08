import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double CelsiusTemp = 0;
        double FahrenheitTemp = 0;
        boolean doneCalculation = false;
        double Calculation = 0;
        String trash = "";


        do {
            System.out.print("Enter a Celsius Temp: ");
            if (input.hasNextDouble())
            {
                CelsiusTemp = input.nextDouble();
                input.nextLine();
                doneCalculation = true;
            }
            else
            {
                System.out.println("Please Enter a Valid Input");
                trash = input.nextLine();
            }




            }while(!doneCalculation );

        FahrenheitTemp = CelsiusTemp * 9/5;
        FahrenheitTemp = FahrenheitTemp + 32;
        System.out.println("The Temp in Fahrenheit is " + FahrenheitTemp);







    }
}
