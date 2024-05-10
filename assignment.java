import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // Program for finding leap year
        Scanner input= new Scanner(System.in);
        System.out.println("write the year to check if it is a leap year or not:");
        int a = input.nextInt();
        
        if (a % 4 == 0) {
            System.out.println("This is a leap year");
        } else{System.out.println("THis is not a leap year");}
    }
}
