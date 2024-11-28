public class Employee {
    String name;
    int id;
    boolean attendence= false;
    int normalWorkDay = 8;
    int salPerHour = 20;
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

    public void calculateWage(){
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
}
