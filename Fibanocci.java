import java.util.*;
class Fibanocci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,fib1=0,fib2=1,fib3,i=2;
System.out.print("enetr the n value:");
n=sc.nextInt();
System.out.print(fib1+" "+fib2+" ");
do
{

fib3=fib1+fib2;
System.out.print(fib3+" ");
fib1=fib3;
fib2=fib2;
i++;
}
while(n>i);
}
}