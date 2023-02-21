public class Parent{

	public Parent(){
		super();
		System.out.println("Parent Default constructor");
}
public Parent(String msg){
		System.out.println("Parent Parameterized constructor");
		System.out.println("Message is:"+msg);


public class Child extends Parent{
	public Child(){
		super();
		System.out.println("Child Default Constructor!")
	}

	public Child(String msg){
		this();
		System.out.println("Child Parameterized constructor");
		System.out.println("Message is :+msg");
	}
	
	public static void main(String args[]){
		Child obj=new Child();
	}
		
}