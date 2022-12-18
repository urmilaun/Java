class Student
{
    int id ;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
    System.out.println(id+ " " +name);
    }
}
    class Teacher{
        
	public static void main(String[] args) {
	Student m1 = new Student(100,"Manju");
	Student m2 = new Student(200,"Urmila");
	m1.display();
	m2.display();
	}
}
