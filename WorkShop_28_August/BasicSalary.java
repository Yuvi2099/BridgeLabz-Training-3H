package WorkShop_28_August;
import java.util.*;
public class BasicSalary {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
	    System.out.println("Enter number of Employees:");
	    int n=read.nextInt();
	    String[]names=new String[n];
	    int[]basic=new int[n];
        System.out.println("Now provide name of all the employees:");
	    for(int i=0;i<n;i++) {
	    	names[i]=read.next();
	    }
	    System.out.println("Now enter their respective salaries:");
	    for(int i=0;i<n;i++) {
	    	basic[i]=read.nextInt();
	    }
	    int[]salary=new int[n];
	    for(int i=0;i<n;i++) {
	    	int hra=(int)(basic[i]*0.2);
	    	int da=(int)(basic[i]*0.1);
	    	salary[i]=hra+da+basic[i];
	    	if(salary[i]>50000) {
	    	    salary[i]=(int)(salary[i]*0.9);
	    	}
	    }
	    for(int i=0;i<n;i++) {
            System.out.println("                                    ");
            System.out.println("                                    ");
	    	System.out.println("The name of the employee is"+":-"+names[i]);
	    	System.out.println("Their basic salary was:-"+basic[i]);
	    	System.out.println("Their current salary is:-"+salary[i]);
	    	System.out.println("                                    ");
	    	System.out.println("                                    ");
	    }
    }
}
