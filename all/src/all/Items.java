package all;

import java.util.Scanner;

public class Items 
{
	static Player ItemGuy = new Player();
	static Scanner scan = new Scanner(System.in);
	
	
	public void desk() 
	{
		System.out.println("The desk is made of oak and look very old all the drawers are empty except on that contains a note would you like to read it");
		String in= scan.nextLine();
		if(in.equalsIgnoreCase("yes"))
		{
			System.out.println("The Note Reads: \n Something about the plot");
		}
	}
	public static void shelf()
	{
		System.out.println("one the shelf there is a flashlight would you like to take it.");
		String in = scan.nextLine();
		if(in.equalsIgnoreCase("yes"));
		{
			ItemGuy.addInventory("flashlight");
		}
	}
	
}
