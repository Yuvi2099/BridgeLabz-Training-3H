package ArrayProblems.level1;
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[]nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=read.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                System.out.println("Negative");
            }
            else if(nums[i]==0){
                System.out.println("Zero");
            }
            else{
                if(nums[i]%2==0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
        }
        int a=nums[0];
        int b=nums[nums.length-1];
        if(a==b){
            System.out.println("First and Last Numbers Are Equal");
        }
        else if(a>b){
            System.out.println("First Number is greater than Second Number");
        }
        else{
            System.out.println("Second Number is greater than First Number");
        }   
    }
}
