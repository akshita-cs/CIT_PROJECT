public class Looping {
    public static void main(String[] args) {
        // int i;
        // for(i=0;i<=5;i++)
        // System.out.println(+i);
        // while(i<5){
        // System.out.println("Value: "+i);
        // i++;
        // }
        // do{
        // System.out.println("Value: "+i);
        // i++;
        // }while(i<5);
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                // break;
                continue;
            System.out.println("Value is: " + i);
        }
    }
}
