public class InstanceInitializationBlock
{
private int x;
{
System.out.println("Initialization Block:x="+x);
x=5;
}
public InstanceClassInitialization()
{
System.out.println("Constructor:x="+x);
}
public static void main(String args[])
{
InstanceInitializationBlock i1= new InstanceInitializationBlock();
InstanceInitializationBlock i2= new InstanceInitializationBlock();
}
}