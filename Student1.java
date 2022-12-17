public class Student1{
    int id = 12;
    String name = "Urmila";
    
    void display()
    {
        System.out.println(id+ " " +name);
    }
    public static void main(String args[]){
        Student1 m1 = new Student1();
        Student1 m2 = new Student1();
        m1.display();
        m2.display();
        
    }
}