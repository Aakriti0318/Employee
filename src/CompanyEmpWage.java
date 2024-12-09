import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CompanyEmpWage<T>{
    Scanner sc=new Scanner(System.in);
    List<T> list=new ArrayList<>();
    String cname;
    public void addComp(T cname){
        list.add(cname);
    }
    public void display(){
        System.out.println("The Company list is as follows:");
        System.out.println(list);
    }
    public CompanyEmpWage(String cname){
        this.cname=cname;
    }
    public String toString(){
        return "Company {name='" + cname + "}";
    }
}
