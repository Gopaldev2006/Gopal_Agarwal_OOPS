import java.util.*;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());
        int sum = 0;

        for (; n != 0; n = n / 10) {
            sum += n % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

