import java.util.Scanner;
public  class Main
{
    public static void main(String args[])
    {

     String str[]= {"break", "case", "continue", "default", "defer", "else","for", "func", "goto", 
     "if", "map", "range", "return", "struct", "type", "var"};

    int flag = 0;
    Scanner sc = new Scanner(System.in);
    String input=sc.nextLine();

    for(int i = 0; i<16;i++){

        if(str[i].equals(input)){
            flag = 1;
            break;
        }
    }

    if(flag==1){
       
printf("%s is a keyword",input);
    }
    else{
        printf("%s is not a keyword",input);
    }
    return 0;
}
}