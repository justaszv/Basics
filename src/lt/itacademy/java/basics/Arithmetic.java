package lt.itacademy.java.basics;

public class Arithmetic {

    public static double calculateVolume(double number){
        number = number * number * number;
        return number;
    }

    public static double calculatePerimeter(double number){
        number = number * 12;
        return number;
    }

    public static double imperialToMetric(double foot, double inches ) {
        double footToInches = foot * 12;
        double inchesToCms = inches * 2.54;
        double result = (footToInches * 2.54) + inchesToCms;
        return result;
    }

}
