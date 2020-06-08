package eda.random_array;

import java.util.Random;
import java.util.Scanner;
public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random(); // creating Random object
	    Scanner sc = new Scanner(System.in);  
		int[] arr = new int[5];
	    int x;  
		int min, max;
		System.out.println("Cuál es el rango?");
		min= sc.nextInt();
		max=sc.nextInt();
	    for (int i = 0; i < arr.length; i++) {
	    	  x=rd.nextInt(); // storing random integers
	    	  if(verifyingInterval(x,min,max)&&verifyingNOTRepetition(x,arr)) {
	    		  arr[i] =x;
	    		  System.out.println(arr[i]); // printing each array element
	    	  }else {
	    		  i-=1;
	    	  }
	    	  
	    }	    
	         
	      }
	


public static boolean verifyingInterval(int x, int min, int max) {
	return min<=x && x<=max;
}
public static boolean verifyingNOTRepetition(int x, int array[]) {
	boolean answ=true;
	for(int i=0;i<array.length;i++) {
		if(x==array[i]) {
			answ=false;
			break;
		}
	}
	return answ;
}
	
}

