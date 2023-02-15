public class Test
{
void recursion(int i)
{
if(i<=10)
{
System.out.println(i);
recursion(i+1);

}

}
public static void main(String[]args)
{
Test obj=new Test();
obj.recursion(1);

}



}





