import java.util.*;
import java.math.*;
public class Program_8
{
    public static void main(String args[])
    {
        int n,temp,r,result=0,count=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        n=sc.nextInt();

        temp=n;
        int check=n;
        while(check>0)
        {
            check=check/10;
            count++;
        }
        while(n>0)
        {
            r=n%10;
            result=result+(int)Math.pow(r,count); //Here result=result+Math.pow(r,count) is not working
            n=n/10;
        }
        if(result==temp)
            System.out.println("Itz an Amstrong number");
        else
            System.out.println("Itz not an Amstrong number");
    }
}