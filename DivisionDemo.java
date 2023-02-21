public class DivisionDemo{
	public static void main(String args[]){
		int a=0,b=0;
		try{
		   int a = Integer.parseInt(args[0]);
		   int b = Integer.parseInt(args[1]);
		   }
		catch(ArrayIndexOutBoundsException e){
		     System.out.println("Please pass 2 command line argument!!!");
		}
		catch(NumberFormatException e){
		     System.out.println("please pass proper numbers from command line for doing divisio!!!");
		}
		catch(ArithmeticException e){
		   System.out.println("Division by zero not possible in outer try!!!");
                }
		catch((Exception e){
		   System.out.println("Exception in Application");
		}
		finally{
		   System.out.println("finally block executes always!!!");
		}
		   System.out.println("End of Application!!!");
	}
}