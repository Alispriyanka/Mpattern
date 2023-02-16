public class Test2
{
public static void recursion(int i)
{
if(i==0)

return;
System.out.println(i); 

recursion(i-1);



}
public static void main(String[]args)
{
int i=10;

recursion(i);

}



}

