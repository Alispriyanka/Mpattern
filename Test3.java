public class Test3
{
public static void recursion(int i)
{
if(i<=100){
if(i%7==0)
{
System.out.println(i); 

}
recursion(i+1);
}

}
public static void main(String[]args)
{
//int i=1;

recursion(1);

}



}

