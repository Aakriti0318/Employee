import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year;
        do {
            System.out.print("Enter a 4-digit year: ");
            while (!sc.hasNextInt()) {
                System.out.print("That's not a valid year. Please enter a 4-digit year: ");
                sc.next();
            }
            year = sc.nextInt();
        } while (year < 1000 || year > 9999);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}

