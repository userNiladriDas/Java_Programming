import java.util.*;
public class ChocolateDistribution
{
    public static void main(String args[])
    {
        int size,m,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Number of chocolates in different packet");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the total number of students");
        m=sc.nextInt();
        //Bubble Sorting
        for(i=0;i<size-1;i++)
        {
            int flag=0;     //flag variable is used for optimization
            for(j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            break;
        }
        int mindiff=Integer.MAX_VALUE;
        for(i=0;i+m-1<size;i++)
        {
            int diff=arr[i+m-1]-arr[i];
            if(diff<mindiff)
            {
                mindiff=diff;
            }
        }

    System.out.println("Minimum Difference= "+mindiff);
    }
}
