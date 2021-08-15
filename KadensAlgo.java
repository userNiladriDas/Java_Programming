//Largest Sum Contigueous Subarray
//Time complexity:  O(n)
import java.util.*;
public class KadensAlgo
{
    public static void main(String args[])
    {
        int size,size2=0,temp,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        size=sc.nextInt();
        temp=size-1;
        int arr[]=new int[size];
        System.out.println("Enter the array element");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxsum=0,cursum=0;
        //Finding minimum when all are negative
        int max=-999999;
        for(i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        //Kadens Algo
        for(j=0;j<size;j++)
        {
            cursum=cursum+arr[j];

            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
            {
                size2++;
                if(temp==size2-1)
                {
                    System.out.println("Largest Sum in contigueous subarray is: "+max);
                }
                else
                {
                    cursum=0;
                }
            }
        }
       // System.out.println("size2="+size2+"temp="+temp);
        if(size2<size)
        {
            System.out.println("Largest Sum in contigueous subarray is: "+maxsum);
        }
    

    }
}