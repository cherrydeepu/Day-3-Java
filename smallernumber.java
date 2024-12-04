import java.util.*;
public class smallernumber{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("a is smaller");
            }
        }else if(b<c){
            System.out.println("b is smaller");
        }else{
            System.out.println("c is smaller");
        }
    }
}