package lt.itacademy.java.basics;

public class Loops {

    public static void daysToHoursAndMinutesFor(int days) {

        int hours = 0;
        int minutes = 0;

        for (int i = 1; i <= days; i++) {

            hours = hours + 24;
            minutes = minutes + 1440;

        }
        System.out.println("The are " + hours + " hours or " + minutes + " minutes in " + days + " days");

    }

    public static void daysToHoursAndMinutesWhile(int days) {

        int hours = 0;
        int minutes = 0;
        int i = 1;

        while (i <= days) {

            hours = hours + 24;
            minutes = minutes + 1440;
            i++;
        }
        System.out.println("The while are " + hours + " hours or " + minutes + " minutes in " + days + " days");

    }

    public static void factorial(int number) {

        int factor = 1;
        for(int i=1; i<=number; i++){
            factor = factor *i;
        }
        System.out.println("Factorial of " + number + " is: " + factor);
    }
}