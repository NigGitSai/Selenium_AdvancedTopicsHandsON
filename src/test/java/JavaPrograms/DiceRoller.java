package JavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();


		System.out.println("Enter the number of roll : ");
		int roll = scanner.nextInt();
		int rolledNumber=0;
		int total =0;
		if(roll<1)
		{
			System.out.println("Dice is not rolled");
		}
		else
		{
			for(int i=0;i<roll;i++)
			{
				rolledNumber = random.nextInt(6)+1;
				total = total+rolledNumber;
				System.out.println("you have rolled "+rolledNumber);
				printDie(rolledNumber);
			}
			System.out.println("total dice points : "+total);
		}

	}

	static void printDie(int roll)
	{
		String dice1= String.join("\n", "  --------","|          |","|    ●     |","|          |","  --------");

		String dice2= String.join("\n", "  --------","| ●        |","|          |","|        ● |","  --------");

		String dice3= String.join("\n", "  --------","| ●        |","|    ●     |","|        ● |","  --------");
		String dice4 =String.join("\n", "  --------","| ●      ● |","|          |","| ●      ● |","  --------");
		String dice5= String.join("\n", "  --------","| ●      ● |","|    ●     |","| ●      ● |","  --------");
		String dice6= String.join("\n", "  --------","| ●      ● |","| ●      ● |","| ●      ● |","  --------");
		switch(roll)
		{
		case 1: 
		{
			System.out.println(dice1);
			break;
		}
		case 2:
		{
			System.out.println(dice2);
			break;
		}
		case 3:
		{
			System.out.println(dice3);
			break;
		}
		case 4:
		{
			System.out.println(dice4);
			break;
		}
		case 5:
		{
			System.out.println(dice5);
			break;
		}
		case 6:
		{
			System.out.println(dice6);
			break;
		}
		default:
		{
			System.out.println(" Wrong number ");
		}
		}
	}
}
