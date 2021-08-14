import java.io.*;
import java.util.*;
public class Program_1
{
    static boolean  isTriplet(int a[], int n)
    {
    int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    int x=a[i]*a[i];
                    int y=a[j]*a[j];
                    int z=a[k]*a[k];
                    if(x==y+z || y==z+x || z==x+y)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

public static void main( String args[])
{
    int n;
    int a[]=new int [20];
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=sc.nextInt();
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    //int a_size=a.length();
    if (isTriplet(a,n) == true) 
    System.out.println("Yes"); 
    else
    System.out.println("No");

}
}