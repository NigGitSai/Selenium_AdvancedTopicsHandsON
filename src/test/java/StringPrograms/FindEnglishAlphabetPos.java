package StringPrograms;

import java.util.Scanner;

public class FindEnglishAlphabetPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To write a Java Program to find the position of english alphabet which user input
		//ASCII small case alphabets starts a from 97 , 65 for A
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter charachter : ");
		char givenChar = sc.next().charAt(0);
		
		givenChar = Character.toLowerCase(givenChar);
		
		int asciiValue = (int)givenChar;
		
		int pos = asciiValue - 96;
		System.out.println("Position of user given character in Alphabet table  "+pos);
	}

}
