public class Test5
{
public static void recursion(int i)
{
if(i<=100){
if(i%2==1)
{
System.out.println(i); 

}
recursion(i+1);
}

}
public static void main(String[]args)
{

recursion(1);

}



}

