//Optimized Bubble sort
//Best case: O(n)
//Worst case: O(n)^2
import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int i,j,temp;
        int arr[]=new int[size];
        System.out.println("Enter the element of the array");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

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

        System.out.println("After swapping!");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}