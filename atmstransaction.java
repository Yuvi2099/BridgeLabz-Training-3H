public class atmstransaction {
    public static void main(String[] args) {
	    	    Scanner read=new Scanner(System.in);
	    	    System.out.println("Enter 1 for deposit , 2 for withdrawl , 3 for exit");
	    	    int x=read.nextInt();
	    	    int balance=0;
	    	    List<Integer>l=new ArrayList<>();
	    	    while(x!=3) {
	    	    	if(x==1) {
	    	    		System.out.println("Enter deposit amount:");
	    	    		int d=read.nextInt();
	    	    		l.add(d);
	    	    		balance=balance+d;
	    	    		System.out.println("Deposit entered successfully!!");
	    	    		System.out.println("Your remainig balance is");
	    	    		System.out.println(balance);
	    	    		System.out.println("Enter 1 for deposit , 2 for withdrawl , 3 for exit");
	    	    		x=read.nextInt();
	    	    	}
	    	    	else {
	    	    		System.out.println("Enter withdrawl amount:");
	    	    		int w=read.nextInt();
	    	    		if(balance>w) {
	    	    			l.add(w);
		    	    		balance=balance-w;
		    	    		System.out.println("Withdrawl taken successfully!!");
		    	    		System.out.println("Your remainig balance is");
		    	    		System.out.println(balance);
		    	    		System.out.println("Enter 1 for deposit , 2 for withdrawl , 3 for exit");
		    	    		x=read.nextInt();
	    	    		}
	    	    		else {
	    	    			System.out.println("Insufficient balance!!");
		    	    		System.out.println("Enter 1 for deposit , 2 for withdrawl , 3 for exit");
		    	    		x=read.nextInt();
	    	    		}
	    	    	}
	    	    }
	    	    System.out.println("Your remainig balance is");
	    		System.out.println(balance);
    	    	System.out.println("THANK YOU FOR CHOOSING SBI!!");
	}
}
