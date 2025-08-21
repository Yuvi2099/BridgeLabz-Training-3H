package StringProblems.level1;
import java.util.*;
public class SubstringEqualStrings {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String x=read.nextLine();
        int startidx=read.nextInt();
        int endidx=read.nextInt();
        String a=x.substring(startidx, endidx+1);
        StringBuilder sb=new StringBuilder();
        for(int i=startidx;i<=endidx;i++){
            sb.append(x.charAt(i));
        }
        String b=sb.toString();
        System.out.println("String using substring method:"+ a);
        System.out.println("String using charAt() method:"+ b);
        if(a.equals(b)==true){
            System.out.println("Strings are Matched");
        }
        else{
            System.out.println("Strings are Unmatched");
        }
    }
}
