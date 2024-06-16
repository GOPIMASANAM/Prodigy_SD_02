package prodigy_infotech;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Random_Num_Search {

	public static void main(String[] args) {
		  
		   Scanner sc=null;
		   Random random=null;
			int ran_num=0,target=0,count=0;
		try {			
			if(sc==null) {
			sc=new Scanner(System.in); 	
			}
			if(random==null) {
        	  random=new Random(); 
	    	}
		System.out.println("Enter Random Number Range: ");	
	    ran_num=random.nextInt(sc.nextInt());	
	    System.out.println("Random number Generated.");
	    boolean flag=true;				
	    while(flag) {
	    	count++;
	    	System.out.println("Please Enter Number: ");
	    	target=sc.nextInt();
	    	if(ran_num==target) {
	    		System.out.println("Random Number is: "+target);
	    		flag=false;
	    	}
	    	else if(ran_num<target) {
	    		System.out.println("Your Target is Low.");
	    	}
	    	else 
	    		System.out.println("Your Target is high.");
	    }
	    System.out.println("You got Random Number at "+count+" search");      
		}
		 catch(InputMismatchException ie) {
    		 System.out.println("You entered wrong input, enter numbers only.");
		 }
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(sc!=null)
				sc.close();
		}
		sc.close();
	} 
}
