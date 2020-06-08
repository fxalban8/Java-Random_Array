package eda.random_array;

import java.util.Random;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random(); // creating Random object
	      int[] arr = new int[5];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); // storing random integers in an array
	         System.out.println(arr[i]); // printing each array element
	      }
	}
}

