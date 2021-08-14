import java.util.*;
public class Prepinsta1
{
    public static void main(String args[])
    {
        int n,x=0,y=0;
        char ch='R';
        int distance=10;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
    
            switch(ch)
            {
                case 'R':
                x=x+distance;
                ch='U';
                distance=distance+10;
                break;

                case 'U':
                y=y+distance;
                ch='L';
                distance=distance+10;
                break;

                case 'L':
                x=x-distance;
                ch='D';
                distance=distance+10;
                break;

                case 'D':
                y=y-distance;
                ch='A';
                distance=distance+10;
                break;

                case 'A':
                x=x+distance;
                ch='R';
                distance=distance+10;
                break;
            }

            n=n-1;

        }

        System.out.println("Coordinates are = "+x+" , "+y);
    }
}