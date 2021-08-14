//Trapezium pattern
import java.util.*;
public class Program_6
{
    public static void main(String args[])
    {
        int i,j,n=4,c1=0,c2=0;

        for(i=n;i>=1;i--)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(++c1+"*");
            }

            for(int z=1;z<=i;z++)
            {
                System.out.print(++c2+i*i);
                if(z!=i)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        
    }
}