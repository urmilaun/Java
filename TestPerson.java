import java.util.*;
public class TestPerson{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.setName("Swara");
        p1.setAddress("Pune");
        p1.setDob("5th Nov");
		
        
        System.out.println("Person Details");
        System.out.println("Name:"+p1.getName());
        System.out.println("Address:"+p1.getAddress());
        System.out.println("Date of Birth:"+p1.getDob());
        
        System.out.println("...................................................");
        
        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Nisha");
        emp1.setAddress("Pune");
        emp1.setDob("19th sept");
        emp1.setSalary(786666);
        
        System.out.println("");
        
    }
}