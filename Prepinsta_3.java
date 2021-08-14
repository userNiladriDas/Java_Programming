import java.util.*;
public class Prepinsta_3
{
    public static void main(String args[])
    {
        long num=0,num1=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        num+=s.charAt(0)-'0';
        for(int i=1;i<s.length();i++)
        {
            if(i%2==0)
            {
                num+= s.charAt(i)-'0';
            }
            else
            {
                num1+= s.charAt(i)-'0';
            }
        }
        long result=num-num1;
        System.out.println("Result"+result);
    }

}