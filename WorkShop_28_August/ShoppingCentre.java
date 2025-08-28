package WorkShop_28_August;
import java.util.*;
public class ShoppingCentre {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
	    System.out.println("Welcome to V MART Shopping Centre");
	    String[]items= {"Shirts","T-Shirts","Jeans","Snacks","Sneakers"};
	    System.out.println("Please select an item for purchase");
	    for(int i=0;i<items.length;i++) {
	    	System.out.println((i+1)+" - "+items[i]);
	    }
	    int choice=read.nextInt();
	    int fare=0;
	    boolean moreshop=true;
	    List<String>l=new ArrayList<>();
	    while(moreshop!=false) {
	    	switch(choice) {
	    	    case 1:
	    	        System.out.println("Your selected item is a Shirt which is around 500 rupees");
	    	        fare=fare+500;
	    	        l.add(items[choice-1]);
	    	        System.out.println("Do you want to continue shopping? Type '1' for yes and '0' for no");
	    	        int ch1=read.nextInt();
	    	        if(ch1==1) {
	    	        	System.out.println("Pick your item again from the item box");
	    	        	choice=read.nextInt();
	    	        }
	    	        else {
	    	        moreshop=false;
	    	        System.out.println("Thank you for shopping!!!  Your total billing amount is"+" "+fare);
	    	        }
	    	        break;
	    	    case 2:
	    	        System.out.println("Your selected item is a T-Shirt which is around 200 rupees");
	    	        fare=fare+200;
	    	        l.add(items[choice-1]);
	    	        System.out.println("Do you want to continue shopping? Type '1' for yes and '0' for no");
	    	        int ch2=read.nextInt();
	    	        if(ch2==1) {
	    	        	System.out.println("Pick your item again from the item box");
	    	        	choice=read.nextInt();
	    	        }
	    	        else {
	    	        	moreshop=false;
	    	        	System.out.println("Thank you for shopping!!!  Your total billing amount is"+" "+fare);
	    	        }
	    	        break;
	    	    case 3:
	    	        System.out.println("Your selected item is a Jeans which is around 800 rupees");
	    	        fare=fare+800;
	    	        l.add(items[choice-1]);
	    	        System.out.println("Do you want to continue shopping? Type '1' for yes and '0' for no");
	    	        int ch3=read.nextInt();
	    	        if(ch3==1) {
	    	        	System.out.println("Pick your item again from the item box");
	    	        	choice=read.nextInt();
	    	        }
	    	        else {
	    	            moreshop=false;
	    	            System.out.println("Thank you for shopping!!!  Your total billing amount is"+" "+fare);
	    	        }
	    	        break;
                case 4:
	    	        System.out.println("Your selected item is a JUMBO SNACK PACK which is around 100 rupees");
	    	        fare=fare+100;
	    	        l.add(items[choice-1]);
	    	        System.out.println("Do you want to continue shopping? Type '1' for yes and '0' for no");
	    	        int ch4=read.nextInt();
	    	        if(ch4==1) {
	    	        	System.out.println("Pick your item again from the item box");
	    	        	choice=read.nextInt();
	    	        }
	    	        else {
	    	        	moreshop=false;
	    	        	System.out.println("Thank you for shopping!!!  Your total billing amount is"+" "+fare);
                    }
	    	        break;
	    	    case 5:
	    	        System.out.println("Your selected item is a pair of Sneakers which is around 2500 rupees");
	    	        fare=fare+2500;
	    	        l.add(items[choice-1]);
	    	        System.out.println("Do you want to continue shopping? Type '1' for yes and '0' for no");
	    	        int ch5=read.nextInt();
	    	        if(ch5==1) {
	    	        	System.out.println("Pick your item again from the item box");
	    	        	choice=read.nextInt();
	    	        }
	    	        else {
	    	        	moreshop=false;
	    	            System.out.println("Thank you for shopping!!!  Your total billing amount is"+" "+fare);
	    	        }
	    	        break;

	    		    default :
	    	        	do {
			    	        System.out.println("Since you hadn't purchased ant item , we make sure that you but at least something as a token for festivel");
			    	        System.out.println("The lowest price rated item is a COFFEE MUG!!!   -- which is off just 20 rupees");
			    	        fare=20;
			    	        l.add("COFFEE MUG");
			    	        moreshop=false;
			    	    }while(moreshop!=false) ;
	    	}
	    }
	    System.out.println("THANK YOU FROM SHOPPING FROM US!!!");
	    for(int i=0;i<l.size();i++) {
	    	System.out.println(l.get(i));
	    }
	    System.out.println("The above mentioned were all the items you bought and the total billing amount is"+"  "+fare);
    }
}
