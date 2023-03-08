package lt.itacademy.java.basics;

public class Operators {

    public static void triangleType(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0)
            System.out.println("InvalidInput");
        else if(a>=(b+c) || c>=(b+a) || b>=(a+c))
            System.out.println("Not a Triangle");
        else if(a==b && b==c)
            System.out.println("Equilateral Triangle");
        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene Triangle");
        else if(a==b || c==a || c==b)
            System.out.println("Isosceles Triangle");

    }

    public static void reach(double distance, double quantity, double consumption, double price) {

        double distanceLeft = (quantity * 100) / consumption;
        double lackOfDistance = distance - distanceLeft;
        double fuelNeeded = (lackOfDistance * consumption) / 100;
        price = 1.25d;
        double priceForFuel = fuelNeeded * price;
        double fuelLeft = ((lackOfDistance * consumption) / 100) * -1;

        if (distanceLeft < distance){
            System.out.println("Destination is in " + distance
                    + " . Car is not able to reach the destination. It needs "
                    + fuelNeeded + " liter of fuel more. It will cost " + priceForFuel);
        } else if (distanceLeft > distance){
            System.out.println("Destination is in " + distance
                    + " . Car is able to reach the destination. It will have " + fuelLeft
                    + " liters of fuel left.");
        }
    }
}

