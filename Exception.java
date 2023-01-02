class UDException extends Exception
{
public String message;
public UDException(String s)
{
message=s
}
class Abc{
void Add()
{
int i,sum=0;
try{
for(i=10;i<=100;i=i+10)
{
sum=sum+i;
}
if(sum>100)
throw new UDException("Addition exceeds 100");
}
else
{
System.out.println(sum);
}
}
}
catch(UDException e)
{
print(e.message)
}
}
