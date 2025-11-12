import java.util.Scanner;

public class Average{
    public static void main(String[]args){
        //Variable declaration x, y, z, a
        double x,y,z,a;
        
        //Creating the Scanner input to store the varables value
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the input
        System.out.print("Enter the value of x: ");
        x =input.nextDouble(); //Read any decimal number and store it in variable 'x'

        System.out.print("Enter the value of y: ");
        y = input.nextDouble(); //Read any decimal number and store it in variable 'y'

        System.out.print("Enter the value of z: ");
        z = input.nextDouble(); //Read any decimal number and store it in variable 'z'

        System.out.print("Enter the value of a: ");
        a = input.nextDouble(); //Read any decimal number and store it in variable 'a'

        double sum = x + y + z + a;
        double average = sum/4;

        System.out.println("The average of the four numbers is: " + average);
        input.close();

    }

}