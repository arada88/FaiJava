package com.buzzfreeze.helloWorld;

public class loop {
   public static void main (String[] args) {
	   //lab6.1
	   for(int i = 1;i <= 10; i++) {
		   System.out.println("i :" + i);   
	   }
	   
	   //lab6.2
	   int sum = 0;
	   int i = 1;
	   for (i = 1; i <= 10; i++) {
	         sum += i;
	      }
	      System.out.println("Summation 1 to 10 = " + sum);
	      
	   //lab6.3
	          int manny=0;
	          String num2="";
	          for(int v=1;v<=100;v++){
	             if((v%12)==0){
	                num2 += v +",";
	                manny++;
	             }
	          }
	          System.out.println(num2 +" have "+ manny +" number");
	       
	   //lab6.4
	   int myArray[] = {1,2,3,4,5};
	   for(int counter : myArray) {
		   System.out.println("Counter :" + counter);
	   }
	   
	   //lab7.1
	   int w = 20;
	   do {
		   System.out.println("w :" + w);
		   w--;
	   }   while (w <= 20 && w > 0);
	   
	   //lab7.2  check if odd or even
	  
		   int y = 20;
            do{
            System.out.println("y :"+ y);
            y--;
            } while (y%2 == 0);

	   
	   //lab8.1 
	   for(int count = 20; count >=0; count--) {
		   if(count == 11)
			   break;
		   System.out.println("count :" + count);
	   } 
	 
   }
   
}
