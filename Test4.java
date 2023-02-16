public class Test4
{
public static void recursion(int i)
{
if(i<=100){
if(i%2==0)
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

