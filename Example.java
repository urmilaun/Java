//Define a class Box length,width,height as member variables.Also Define setDiamension() and showDiamension() as member functions

class Box
{
int length,breadth,height;
public void setDiamension(int l, int b, int h)
{
length=l;
breadth=b;
height=h;
}
public void ShowDiamension()
{
System.out.println("L="+length);
System.out.println("b="+breadth);
System.out.println("h="+height);
}
}
class Example
{
public static void main()
{
Box b1=new Box();
b1.setDiamension(12,10,5);
b1.ShowDiamension();
}
}