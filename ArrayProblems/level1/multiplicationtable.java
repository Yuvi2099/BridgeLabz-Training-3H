package ArrayProblems.level1;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number to display it's multiplication table:");
        int num=read.nextInt();
        int[]table=new int[10];
        for(int i=0;i<10;i++){
            table[i]=(i+1)*num;
            System.out.println(num + "x" + (i+1) + "=" + table[i]);
        }
    }
}
