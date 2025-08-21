package StringProblems.level1;
import java.util.*;
public class EqualStrings {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String a=read.nextLine();
        String b=read.nextLine();
        boolean check=true;
        if(a.length()!=b.length()){
            check=false;
        }
        else{
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i)){
                    check=false;
                }
            }
        }
        boolean confirm=a.equals(b);
        System.out.println("Comparison using charAt():"+ check);
        System.out.println("Comparison using equal():"+ confirm);
        if(confirm==check){
            System.out.println("matched");
        }
        else{
            System.out.println("not matched");
        }
    }
}
