import java.util.*;
public class Program_3
{
    public static void main(String args[])
    {
        int low,high,n,counter=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        low=sc.nextInt();
        System.out.println("Enter the upper limit");
        high=sc.nextInt();

        while(low<=high)
        {
            int c=0,temp;

            for (int i=1;i<=low;i++)
            {
                
                if(low%i==0)
                {
                    c++;
                   // temp=low;
                }
            }
            if(c==2)
                {
                   // counter=counter+1;
                    System.out.println("     "+ low);
                }
            low=low+1;
        }
    }
}