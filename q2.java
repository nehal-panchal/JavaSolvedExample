// # Que 2 -  In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

import java.util.*;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A : ");
        int a = sc.nextInt();
        System.out.print("Enter number B : ");
        int b = sc.nextInt();
        System.out.print("Enter number C : ");
        int c = sc.nextInt();
        int sum = a + b + c;

        System.out.println("Average of three numbers is = "+ sum/3);
    }
}