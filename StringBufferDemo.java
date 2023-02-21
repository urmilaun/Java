import java.util.*;
class StringBufferDemo
{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("sb : "+sb);
        sb.append("Hi");
        System.out.println("After appending Hi : sb : "+sb);

        sb.delete(0, 5);
        System.out.println("After delete(0,5) : sb : "+sb);
        sb.insert(0, "Welcome");
        System.out.println("After insert(0,Welcome) : sb : "+sb);
        sb.replace(0, 7, "Hello");
        System.out.println("After replace(0,7,Hello) : sb : "+sb);
        sb.reverse();
        System.out.println("After reverse sb : "+sb);
    }
}