import java.util.*;

public class lineComparison {
    //creating method
    public void calculateLenght(double x1, double y1, double x2, double y2){
        double result = Math.sqrt(Math.pow(x2 -x1 , 2) + Math.pow(y2 - y1 , 2));
        System.out.println("Result is: "+ result);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        Scanner scan = new Scanner(System.in);

        //taking user input
        System.out.println("Enter a value for x1: ");
        double val_x1 = scan.nextDouble();

        System.out.println("Enter a value for y1: ");
        double val_y1 = scan.nextDouble();

        System.out.println("Enter a value for x2: ");
        double val_x2 = scan.nextDouble();

        System.out.println("Enter a value for y2: ");
        double val_y2 = scan.nextDouble();

        lineComparison obj = new lineComparison();
        obj.calculateLenght(val_x1, val_y1, val_x2, val_y2);
    }
}