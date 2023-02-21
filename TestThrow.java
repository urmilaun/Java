public class TestThrow{
    public static void main(String args[]){
       TestThrow test=new TestThrow();
try{
test.division(10,5);
}
catch(ArithmeticException e){
System.out.println("Division by zero not possibl in main!!!");

}
void division(int a,int b){
System.out.println("Inside division()!!!");
if(b==0){
try{
	throw new ArithmeticException();
}
catch(ArithmeticException e){
	System.out.println("Division by Zero not possible in division()!!!");
}
	System.out.println("Hello");
}
else{
Sysem.out.println("Division Result of "+a+" and "+b+" is :"+(a/b));
}
System.out.println("End of Division!!!");
}
}