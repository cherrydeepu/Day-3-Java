import java.util.*;
public class evenoddusingbit{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        if((a&1)==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}