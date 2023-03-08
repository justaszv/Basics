package lt.itacademy.java.basics;

public class Calculator {

    public static void shapeCalc(String shapeType, double height, double width) {

        double perimeter = 0;
        double area = 0;

        switch (shapeType) {
            case "Square":
                perimeter = height * 4;
                area = height * height;
                System.out.println("Square perimeter is " + perimeter + " , area is " + area);
                break;
            case "Rectangle":
                perimeter = (height + width) * 2;
                area = height * width;
                System.out.println("Rectangle perimeter is " + perimeter + " , area is " + area);
                break;
            case "Triangle":
                perimeter = (height * 2) + width;
                area = (height * width) / 2;
                System.out.println("Triangle perimeter is " + perimeter + " , area is " + area);
                break;
            default:
                System.out.println("Invalid shape name");
        }

    }




}
