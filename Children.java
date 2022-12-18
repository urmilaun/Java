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
    class Boy extends Student
    {
        void print()
        {
            System.out.println("Morning");
        }
    }
    class Children
    {
        public static void main(String args[])
        {
            Student s = new Student();
            s.print();
            s.get();
            s.put();
            
            
        }
    }

