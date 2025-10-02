// # Que 4 - Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill. 
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;
public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of a pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the amount of a pen = ");
        float pen = sc.nextFloat();
        System.out.print("Enter the amount of a eraser = ");
        float eraser = sc.nextFloat();

        System.out.println("Total bill = "+ (pencil + pen + eraser));
        
        // Bill with GST 18%

        float sum = pencil + pen + eraser;
        System.out.println("Bill with GTS = "+ (sum + (sum*0.18)));
    }
}

