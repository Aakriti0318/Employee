import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Employee e1=  new Employee("Ram",123);
        Random r = new Random();
        int i = (r.nextInt(1000))%3;
        switch (i){
            case 1 -> e1.attendance(true);
            case 2 ->
            {   e1.attendance(true);
                System.out.println("Part time today");
                e1.normalWorkDay = 4;
            }

            default -> e1.attendance(false);
        }
        e1.calculateWage();
    }
}