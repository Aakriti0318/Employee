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
