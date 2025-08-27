import java.util.*;
public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
	    	    System.out.println("Enter number of batsmans who scored:");
	    	    int n=read.nextInt();
	    	    int[]scores=new int[n];
	    	    System.out.println("Enter their individual scores");
	    	    for(int i=0;i<n;i++) {
	    	    	scores[i]=read.nextInt();
	    	    }
	    	    int total=0;
	    	    int max=0;
	    	    int min=scores[0];
	    	    for(int i=0;i<scores.length;i++) {
	    	    	total=total+scores[i];
	    	    	if(max<scores[i]) {
	    	    		max=scores[i];
	    	    	}
	    	    	if(min>scores[i]) {
	    	    		min=scores[i];
	    	    	}
	    	    	if(scores[i]>=100) {
	    	    		System.out.println("Century scored by "+(i+1)+"th player");
	    	    	}
	    	    }
	    	    System.out.println("Team's total score is:");
	    	    System.out.println(total);
	    	    System.out.println("Team's average score is:");
	    	    System.out.println(total/n);
	    	    System.out.println("Team's highest individual score is:");
	    	    System.out.println(max);
	    	    System.out.println("Team's lowest individual score is:");
	    	    System.out.println(min);
    }
}
