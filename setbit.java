import java.util.*;
public class setbit{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int pos=S.nextInt();
        if((a&(1<<pos))!=0){
            System.out.println("SetBit");
        }else{
            System.out.println("Not a SetBit");
        }
     }
}