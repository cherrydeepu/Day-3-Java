import java.util.*;
public class power{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        if((a&(a-1))==0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not Power of 2");
        }
    }
}