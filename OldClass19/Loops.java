package OldClass19;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		// while loop, do while loop, for loop, for  each loop
		
		//For Loop: 
		//s = 0 means this is where my conditions starts
		//s<6 means this is where my condition ends
		//s++ means incremental
		//-- means decremental (How we go between condition incrementing or decrementing)
		for (int s = 0; s <= 4; s++) {//java set up on his mind : 5 times loop need to run
			System.out.println("For Loop: Value of s is =  " + s);
		}
		
		//While Loop
		int a = 0;
		while(a<5) {
			System.out.println("its while loop: " + a);
			a++;
		}
		
		//enhanced for loop
		//create an array and insert 3 names
		String array[] = {"Apu", "Sourav", "Adnan"};
		System.out.println("length of array is " + array.length);
		for (String s:array) {
			System.out.println("My name is " + s );
		}
		
		//do while loops
		int z = 10;// start condition
		do {
			System.out.println("My number is " + z);
			z++;
		} while (z<20);// end condition
		
		
		//How to add value inside array list
		ArrayList<String> arrayList = new ArrayList<String> ();
		//arrayList.add("Apu");
		System.out.println(arrayList.size());
		//System.out.println(arrayList.get(0));
		for(int b = 0; b < 5; b++) {
			arrayList.add("Apu");	
		}
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		
		//for each loop
		
		
		/*
		int num = 10;
		while (num<20) {
			System.out.println("This is while Loop");
			num++;
		}
		
		do {
			System.out.println("This is do while loop");
			num++;
			} while(num<20);
		
		for (int i = 1; i<=10; i++) {
			System.out.println("This is for Loop " +i);
		}*/

	}

}
