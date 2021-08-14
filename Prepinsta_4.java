import java.util.*;
public class Prepinsta_4
{
    public static void main(String args[])
    {
        String K[]={"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
            Scanner sc=new Scanner(System.in);
            String st=sc.nextLine();
        
            int flag=0,i;
            for(i = 0; i<K.length(); i++)
            {
                if(st.equals(K[i])) 
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("%s is a keyword"+st);
            else
                System.out.println("%s is not a keyword"+st);
            
    }
}
