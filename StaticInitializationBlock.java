public class StaticInitializationBlock
{
private static int k;
static
{
System.out.println("Static Initialization Block k="+k);
k=10;
}
public static void main(String args[])
{
new  StaticInitializationBlock();
}
}
