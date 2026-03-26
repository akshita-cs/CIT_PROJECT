import java.util.Scanner;

public class UnitsIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total units consumed: ");
        int units = sc.nextInt();
        System.out.println("Total units consumed is: " + units);
        double d = 1.5;
        int e = 3;
        if (units <= 150)
            System.out.println("Amount to be paid: " + (units * d));
        else
            System.out.println("Amount to be paid: " + (units * e));

    }
}
