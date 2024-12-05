import java.util.*;
public class middleno{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(b<a)
        {
            if(a<c){
            System.out.println("middle value is a="+a);
            }
            else{
            System.out.println("middle value is c="+c);
            }
        }else{
            if(b<c)
            {
            System.out.println("middle value is b="+b);
            }
            else{
                System.out.println("middle value is c="+c);
            } 
        }
    }
}