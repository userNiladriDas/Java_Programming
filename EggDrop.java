import java.util.*;
public class EggDrop
{
    public static void main(String args[])
    {
        int egg,floor;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of egg!");
        egg=sc.nextInt();
        System.out.println("Enter the total number of floor!");
        floor=sc.nextInt();
        int dp[][]=new int[egg+1][floor+1];
        for(int i=1;i<=egg;i++)
        {
            for(int j=1;j<=floor;j++)
            {
                if(j==1)
                {
                    dp[i][j]=j;
                }
                else
                if(i==1)
                {
                    dp[i][j]=j;
                }
                else
                {
                    int min=Integer.MAX_VALUE;
                    for(int myj=j-1,prej=0;myj>=0;myj--,prej++)
                    {

                        int v1=dp[i][myj];
                        int v2=dp[i-1][prej];
                        int val=Math.max(v1,v2);
                        min=Math.min(min,val);
                    }
                    dp[i][j]=min+1;
                }
            }
        }
        System.out.println("Minimum number of trials in worst case with "+egg+" eggs and "+floor+" floors is " + dp[egg][floor]);

    }
}