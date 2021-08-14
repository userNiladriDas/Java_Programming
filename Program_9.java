import java.util.*;
public class Program_9
{
    public static void main(String args[])
    {
        int i,j,k,n,positions,c=0,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term");
        n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
            if(i%2==0)
            {
                int temp=i;
                    for(j=1;j<=n;j++)
                    {
                        if(temp%j==0)
                        {
                            c++;
                        }
                    }
                    if(c==2)
                    {
                        System.out.println(temp);
                    }
            }
            else
            {
                    if (n == 0)
                    {
                        System.out.println(a);
                    }
                    else
                    {
                            c = a + b;
                            a = b;
                            b = c;
                            System.out.print(b+" ");
                    }
            }
      }
    }
}