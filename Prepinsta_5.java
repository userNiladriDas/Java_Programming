import java.util.*;
public class Prepinsta_5
{
    public static void main(String args[])
    {
        int i,j,result=1;
        System.out.println("Enter the Nth term to find the elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //for(i=1;i<=n;i++)
        //{
        if(n%2==0)
        {
            for(i=1;i<=((n/2)-1);i++)
            {
                 result=result*3;
            }
        }
        else
        {
            for(j=1;j<=((n/2));j++)
            {
                 result=result*2;
            }
        }
       // }
    System.out.println("Results= "+result);

    }
}