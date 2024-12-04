import java.util.*;
public class controlstmtnestedif{
    public static void main(String args[]){
    Scanner S=new Scanner(System.in);
    int a=S.nextInt();
    int b=S.nextInt();
    int c=S.nextInt();
    if(a>b){
        if(a>c){
            System.out.println("a is bigger");
        }
    }else if(b>c){
        System.out.println("b is bigger");
    }else{
        System.out.println("c is bigger");
    }
    }
}