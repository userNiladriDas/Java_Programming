import java.util.*;
public class Program_4
{
    public static void main(String args[])
    {
        int i,j;
        int arr[]=new int [20];
        int fre[]=new int [20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int visited=-1;
        for(i=0;i<n;i++)
        {
            int count=1;
            for( j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fre[j]=visited;
                }
            }

            if(fre[i] !=visited)
            {
                fre[i]=count;
            }
        }
        System.out.println("Elements||Frequency");
        for(i=0;i<n;i++)
        {
            if(fre[i]!=visited)
            {
                System.out.println(arr[i]+"         ||     "+fre[i]);
            }
        }

    }
}