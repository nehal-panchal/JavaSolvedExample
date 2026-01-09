import java.util.*;

class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 digit number - ");
        int num = sc.nextInt();

        int first = num / 100;        // first digit
        int middle = (num / 10) % 10; // middle digit
        int last = num % 10;          // last digit

        if (middle > first && middle > last) {
            System.out.println("Middle digit is the largest");
        } 
        else if (middle < first && middle < last) {
            System.out.println("Middle digit is the smallest");
        } 
        else {
            System.out.println("Middle digit is neither largest nor smallest");
        }
    }
}
