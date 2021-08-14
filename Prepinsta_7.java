import java.util.*;
public class Prepinsta_7
{
    static public void main(String args[])
    {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();
        
        System.out.println(s1.replaceAll("[a,e,i,o,u,A,E,I,O,U]","*")+s2.replaceAll("[B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y,Z,b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z]","@")+s3.toUpperCase());



    }
}