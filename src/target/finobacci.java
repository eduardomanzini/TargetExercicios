package target;

import java.util.Scanner;

public class finobacci {

	public static void main(String[] args) {
		       
		int num1 = 1, num2 = 0;
		        
		 Scanner sc = new Scanner(System.in);
		        
		        
		System.out.print("Informe um numero da sequencia de fibonacci: ");
		int numero = sc.nextInt();
		        
		 System.out.println(num2);
		 System.out.println(num1);
		        
		  for(int i = 0; i < numero; i++){
		         num1 = num1 + num2;
		         num2 = num1 - num2;
		         System.out.println(num1);
		  }  
		  sc.close();
   }		  	
}   

	    	 		



	


