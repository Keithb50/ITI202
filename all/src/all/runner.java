package all;

import java.util.Scanner;

public class runner 
{
	public static void main (String args[])
	{
		Player guy = new Player();
		Items item= new Items();
		Rooms roomGen= new Rooms();
		roomGen.StartRoom();
		Scanner scan = new Scanner(System.in);
		 String in="";
		in=scan.nextLine();
  		switch(in)
  		{
  		
  		case "north":
  		guy.north();
  			break;	
  			
  		case "east":
  	  	guy.east();
  	  		break;	
  	  		
  		case "south":
  	  	guy.south();
  	  		break;	
  	  		
  		case "west":
  	  	guy.west();
  	  		break;
  	  		
  		case "desk":
  		item.desk();
  			break;
  			
  		case "shelf":
  		item.shelf();
  			break;
  			
  		}
  
	}
	
}
