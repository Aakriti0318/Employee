import javax.sound.sampled.Line;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Employee e1=  new Employee("Ram",123);
//        Random r = new Random();
//        int i = (r.nextInt(1000))%3;
//        switch (i){
//            case 1 -> e1.attendance(true);
//            case 2 ->
//            {   e1.attendance(true);
//                System.out.println("Part time today");
//                e1.normalWorkDay = 4;
//            }
//
//            default -> e1.attendance(false);
//        }
//        e1.calculateWage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation\n");
        // Input coordinates for Line 1
        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Input coordinates for Line 2
        System.out.println("Enter coordinates for Line 2 (x3, y3, x4, y4): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        // Create Line objects
        LineComparision line1 = new LineComparision(x1, y1, x2, y2);
        LineComparision line2 = new LineComparision(x3, y3, x4,y4);
        //finding the length of the line
        line1.length(x1,x2,y1,y2);
        line2.length(x3,x4,y3,y4);
        //for finding the comparision
        line1.compareTo(x1,x2,x3,x4,y1,y2,y3,y4);

}}