import java.util.*;
public class multiple{
    public static void main (String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        if((a&3)==0){
            System.out.println("Multiple of 4");
        }else{
            System.out.println("Not Multiple of 4");
        }
    }
}