import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
int rev=0,remainder,a;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
a=num;
while(num!=0)
{
remainder=num%10;
rev=(rev*10)+remainder;
num /=10;
}
if(rev==a)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not a palindrome");
}}}
