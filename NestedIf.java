import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Age of the person is: "+age);
        if(age >= 18){
            if(age >= 65){
                System.out.println("Eligible to vote and avail government fund.");
            }
            else{
                System.out.println("Eligible to vote and not eligible to avail government fund.");
            }
        }
        else{
            System.out.println("Not eligible to vote.");
        }           
    }
}
