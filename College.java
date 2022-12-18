class Teacher{
    void get()
    {
        System.out.println("Hello");
    }
}
    class Student extends Teacher
    {
    void put()
    {
        System.out.println("Hiii");
    }
    }
    class College
    {
        public static void main(String args[])
        {
            Student s = new Student();
            s.get();
            s.put();
            
        }
    }