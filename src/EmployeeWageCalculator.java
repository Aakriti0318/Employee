import java.util.Random;
import java.util.Scanner;
public class Main {
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int WAGE_PER_HOUR = 20;
    static int totalHours = 0;
    static int  totalDays = 0;
    static int maxHours = 100;
    static int maxDays = 20;
    static int day=1;
    static String name;
    static int id;
    public static void main(String[] args) {
        Employee e1=  new Employee(name,id);
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees to be entered:");
        int n=sc.nextInt();
        while(n!=0){
            System.out.println("Enter the name:");
            String name=sc.next();
            System.out.println("Enter the id:");
            int id=sc.nextInt();
            e1.addEmp(new Employee(name,id));
            n--;
        }
        System.out.println("Employees added successfully!");
        e1.display();
        while (totalHours<=maxHours && totalDays<=maxDays) {
            int i =(int)(Math.random()*3); //0 for absent,1 for part-time,2 for full time
            switch (i) {
                case 0 -> {
                    System.out.println("day:"+day);
                    e1.attendance(0);
                    day++;

                }
                case 1 -> {
                    System.out.println("day:"+day);
                    e1.attendance(1);
                    totalHours += PART_TIME_HOURS;
                    System.out.println("The daily wage of an employee:"+e1.calculateDailyWage(PART_TIME_HOURS,WAGE_PER_HOUR ));
                    day++;
                }
                case 2->{
                    System.out.println("day:"+day);
                    e1.attendance(2);
                    totalHours +=FULL_TIME_HOURS;
                    System.out.println("The daily wage of an employee:"+e1.calculateDailyWage(FULL_TIME_HOURS,WAGE_PER_HOUR ));
                    day++;
                }
                default -> e1.attendance(0);
            }
        }
        System.out.println("The monthly wage of an employee:"+e1.calculateMonthlyWage(totalHours));
            String k = e1.toString();
            System.out.println(k);
        }
    }

