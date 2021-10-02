
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // asks user info about employee
        boolean useAgain = true;

        while (useAgain = true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Employee name:");
            String eName = input.next();
            System.out.println("Hours worked this week: (note , for each hour above 45, a paid overtime of 1.5X regular wages will be applied) ");
            int hours = input.nextInt();
            System.out.println("hourly wage:");
            double wage = input.nextDouble();

            // calculates regular wages
            int overtime = (hours % 45);
            int regTime = (hours - overtime);
            double regWage = (wage * regTime);

            // calculates overtime
            double overPay = (wage * 1.5);
            double overWage = (overPay * overtime);

            double preTax = (overWage + regWage);

            //calculates tax
            double tax = (preTax / 5);
            double postTax = (preTax - tax);

            System.out.println(eName);
            System.out.println("hours worked: " + (hours));
            System.out.println("wages pre-tax: " + (preTax));
            System.out.println("wages after tax: " + (postTax));
            System.out.println("would you like to calculate the wages of another employee?");
            useAgain = input.nextBoolean();
        }
    }

}