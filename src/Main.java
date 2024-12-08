import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter normalWorkDay:");
        int normalWorkDay = sc.nextInt();
        System.out.println("Enter salPerHour:");
        int salPerHour =sc.nextInt();
       Employee e1=  new Employee("Ram",123);
        Random r = new Random();
        int i = (r.nextInt(1000))%3;
        switch (i){
            case 1 -> e1.attendance(true);
            case 2 ->
            {   e1.attendance(true);
                if(salPerHour==8
                ){
                System.out.println("Part time today");
            }

            }

            default -> e1.attendance(false);
        }
        System.out.println("The wage of the employee:");
        e1.calculateWage(normalWorkDay,salPerHour);
        String k=e1.toString();
        System.out.println(k);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to Line Comparison Computation\n");
//        // Input coordinates for Line 1
//        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
//        double x1 = sc.nextDouble();
//        double y1 = sc.nextDouble();
//        double x2 = sc.nextDouble();
//        double y2 = sc.nextDouble();
//
//        // Input coordinates for Line 2
//        System.out.println("Enter coordinates for Line 2 (x3, y3, x4, y4): ");
//        double x3 = sc.nextDouble();
//        double y3 = sc.nextDouble();
//        double x4 = sc.nextDouble();
//        double y4 = sc.nextDouble();
//
//        // Create Line objects
//        LineComparison line1 = new LineComparison(x1, y1, x2, y2);
//        LineComparison line2 = new LineComparison(x3, y3, x4,y4);
//        //finding the length of the line
//        line1.length(x1,x2,y1,y2);
//        line2.length(x3,x4,y3,y4);
//        //for finding the comparison
//        line1.compareTo(x1,x2,x3,x4,y1,y2,y3,y4);
//
}}