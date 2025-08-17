import java.util.*;
public class difference {
    public static void main(String[] agrgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a =sc.nextInt();
        System.out.println("Enter the second number;");
        int b=sc.nextInt();
        if(a>=0 && b>=0){
            System.out.println("The numbers are positive.");

        }else{
            System.out.println("The numbers are not positive.");
        }
    }

    
}