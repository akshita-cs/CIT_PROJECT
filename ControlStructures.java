import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age: ");
        // int age = sc.nextInt();
        // if(age>=18)
        //System.out.println("Eligible to vote. ");
        // else
        // System.out.println("Not eligible to vote.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b)
            System.out.println("a is the largest");
        else
            System.out.println("b is the largest");
        sc.close();
    }
    
}
