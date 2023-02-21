import java.util.*;
public class MethodOverloading{
    void show(){
        System.out.println("show() in method overloading");
    }
    
    String show(String msg){
        System.out.println("show(string)in method overloading");
        return msg;
    }
    
    void show(int number){
        System.out.println("show(int) in method overloading");
        System.out.println("Number is:"+number);
    }
    
    public static void main(String args[]){
        MethodOverloading demo = new MethodOverloading();
        demo.show();
        String s = demo.show("Hello");
        System.out.println("Message is :"+5);
        demo.show(10);
    }
}