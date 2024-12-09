import java.util.ArrayList;
import java.util.List;
public class Employee{
    String ename;//Name of the employee
    int id;//id of the employee
    private static final int WAGE_PER_HOUR = 20;
//Calculating Daily Wages
    public static int calculateDailyWage(int hours,int WAGE_PER_HOUR ) {
        return hours * WAGE_PER_HOUR;
    }
    public void attendance(int a){
        if(a==1 || a==2){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
    //Calculating Monthly wages
    public static int calculateMonthlyWage(int totalHours) {
        return totalHours*WAGE_PER_HOUR;
    }
    Employee(String ename, int id){
        this.ename = ename;
        this.id = id;
    }
    public String toString(){
        return "Employee {name='" + ename + "', id=" + id + "}";
    }
}
