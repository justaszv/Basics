package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter first side");
//        int a = scanner.nextInt();
//        System.out.println("Enter second side");
//        int b = scanner.nextInt();
//        System.out.println("Enter third side");
//        int c = scanner.nextInt();
//        Operators.triangleType(a,b,c);

//        Loops.daysToHoursAndMinutesFor(365);
//        Loops.daysToHoursAndMinutesWhile(365);
//        Loops.factorial(5);

        while (true) {
            System.out.println("Enter shape name");
            String shape = scanner.nextLine();
            System.out.println("Enter height");
            double height = scanner.nextDouble();
            System.out.println("Enter width");
            double width = scanner.nextDouble();
            Calculator.shapeCalc(shape, height, width);
        }

    }


}
