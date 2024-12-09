import java.util.Random;
import java.util.Scanner;
public class EmployeeWageCalculator{
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int WAGE_PER_HOUR = 20;
    static int totalHours = 0;
    static int day=1;
    static String ename;
    static String cname;
    static int id;

    public static void main(String[] args) {
        Employee e1=  new Employee(ename,id);
        CompanyEmpWage c1=new CompanyEmpWage(cname);
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of companies to be entered:");
        int n=sc.nextInt();
        while(n!=0){
            System.out.println("Enter the name of the company:");
            String cname=sc.next();
            c1.addComp(new CompanyEmpWage(cname));
            n--;
        }

        System.out.println("Company added successfully!");
        c1.display();
        for(int j=0;j<c1.list.size();j++) {
            totalHours=0;
            day=0;
            System.out.println("Enter the company"+(j+1)+" maxHours:");
            int maxHours = sc.nextInt();
            System.out.println("Enter the company"+(j+1)+" maxDays:");
            int maxDays = sc.nextInt();
            System.out.println("The total Employee Wage Computation is as follows for"+ c1.list.get(j));
            while (totalHours <= maxHours && day <= maxDays) {
                int i = (int) (Math.random() * 3); //0 for absent,1 for part-time,2 for full time
                switch (i) {
                    case 0 -> {
                        System.out.println("day:" + day);
                        e1.attendance(0);
                        day++;

                    }
                    case 1 -> {
                        System.out.println("day:" + day);
                        e1.attendance(1);
                        totalHours += PART_TIME_HOURS;
                        System.out.println("The daily wage of an employee:" + e1.calculateDailyWage(PART_TIME_HOURS, WAGE_PER_HOUR));
                        day++;
                    }
                    case 2 -> {
                        System.out.println("day:" + day);
                        e1.attendance(2);
                        totalHours += FULL_TIME_HOURS;
                        System.out.println("The daily wage of an employee:" + e1.calculateDailyWage(FULL_TIME_HOURS, WAGE_PER_HOUR));
                        day++;
                    }
                    default -> e1.attendance(0);
                }
            }
            System.out.println("The monthly wage of an employee:" + e1.calculateMonthlyWage(totalHours));
        }
            String k = e1.toString();
            System.out.println(k);
        }
    }

