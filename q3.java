// # Que 3 - In a program, input the side of a square. You have to output the area of the square.

import java.util.*;
public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square : ");
        double side = sc.nextDouble();
        System.out.println("The area of square is = "+ (side * side));
    }
}