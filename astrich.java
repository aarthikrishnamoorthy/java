import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for (int a=1;a<=n;a++)
{
	for(int b=1;b<=a;b++)
	{
		System.out.print('*');
	}
	for(int c=a+1;c<=n;c++)
	{
		System.out.print(' ');
	}
	System.out.println();
	}
}
}
