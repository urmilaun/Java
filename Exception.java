class MyException extends Exception{
     public MyException(String Msg){
	super(Msg);
      }
}
MyException obj = new MyException("This is MyException!!!");
obj.getMEssage();

java.lang

public class Exception{
    private String message;
    }
 
    public Exception(String message){
       this.message=message;
    }
    public String getMessage){
       return message;
    }
}