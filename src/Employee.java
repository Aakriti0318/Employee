import java.util.Scanner;
public class Employee {
    String name;
    int id;
    boolean attendence= false;
    Scanner sc=new Scanner(System.in);
    double dailySalary = 0;
    public void attendance(boolean a){
        if(a){
            attendence = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
    public void calculateWage(int normalWorkDay,int salPerHour){
        if(attendence){
            dailySalary = normalWorkDay*salPerHour;
            System.out.println(dailySalary);
        }else{
            dailySalary = 0;
            System.out.println(dailySalary);
        }
    }
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return "Employee {name='" + name + "', id=" + id + "}";
    }
}
