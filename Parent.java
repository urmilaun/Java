public class Parent{

	public Parent(){
		super();
		System.out.println("Parent Default constructor");
}
public Parent(String msg){
		System.out.println("Parent Parameterized constructor");
		System.out.println("Message is:"+msg);
            
        }
}
        