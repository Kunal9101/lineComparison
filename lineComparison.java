import java.util.*;

public class lineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        Scanner scan = new Scanner(System.in);

        //taking user input for line one
        System.out.println("Enter Co-ordinates for line 1");
        System.out.println("Enter a value for line 1- x1: ");
        double val1_x1 = scan.nextDouble();

        System.out.println("Enter a value for line 1- y1: ");
        double val1_y1 = scan.nextDouble();

        System.out.println("Enter a value for line 1- x2: ");
        double val1_x2 = scan.nextDouble();

        System.out.println("Enter a value for line 1- y2: ");
        double val1_y2 = scan.nextDouble();

        //creating first line array
        double [] first_line = {val1_x1 , val1_y1 , val1_x2 , val1_y2};

         //taking user input for line two
         System.out.println("\nEnter Co-ordinates for line 2");
         System.out.println("Enter a value for line 2- x1: ");
         double val2_x1 = scan.nextDouble();
 
         System.out.println("Enter a value for line 2- y1: ");
         double val2_y1 = scan.nextDouble();
 
         System.out.println("Enter a value for line 2- x2: ");
         double val2_x2 = scan.nextDouble();
 
         System.out.println("Enter a value for line 2- y2: ");
         double val2_y2 = scan.nextDouble();
 
         //creating first line array
         double [] second_line = {val2_x1 , val2_y1 , val2_x2 , val2_y2};

         //checking wheather equal or greather than or less than
         
        if (Arrays.compare(first_line, second_line) > 0){
            System.out.println("\nFirst line is Greater than second line___");
         } 
        else if (Arrays.compare(first_line, second_line) < 0){
            System.out.println("\nsecond line is greather than first line___");
         }
        else {
            System.out.println("\nBoth line are equal___");
        }


    }
}