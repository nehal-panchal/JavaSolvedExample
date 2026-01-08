import java.util.*;
class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 digit number - ");
        int num = sc.nextInt();

        int a = num / 100;        // first digit
        int b = (num / 10) % 10; // second digit
        int c = num % 10;        // third digit

        if (a != b && b != c && a != c) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("Digits are not distinct");
        }
    }
}
