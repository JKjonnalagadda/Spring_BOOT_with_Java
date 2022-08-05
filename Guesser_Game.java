import java.util.*;

//Guesser Number Class 
class Guessing
{
	int newGuess;
	public int GuessingTurn(){
	Scanner G=new Scanner(System.in);
	
	newGuess=G.nextInt();
	
	return(newGuess);
	
	
	}
}

//Players Class

class Players
{
	
	Scanner P=new Scanner(System.in);
	int n=P.nextInt();												//Taking the Number of players to be participate from the User
	int  []playerId=new int[n];										//Initilazing an array		
	int count=0;
	
	
   
	public void PlayerTurn() {
		
	for(int i=0;i<n;i++) {										//Taking multiple players into a array
		count=i+1;
		System.out.println("Please Enter the Player"+count);
		playerId[i]=P.nextInt();		
		
		}	
	}
}

//UmpireClass
class Umpireturn {
	
	int numFromGuessing;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	
	
	public void check()
	{
		Guessing g=new Guessing();
		int round=1;
		System.out.println("***********************Round"+round+"Starts**************************");
		System.out.println("Please Enter the Guessing Number in round"+round);
	
		
		numFromGuessing=g.GuessingTurn();
		
		
		System.out.println("Please Enter the count of the Players ");
		
		Players pobj=new Players();
		pobj.PlayerTurn();
		
		int n1=pobj.n;
		
		int count=pobj.n;
		while(count>1) {
			count=0;
			round++;
			
		for(int i=0;i<n1;i++)
		{
			
			if(pobj.playerId[i]==numFromGuessing) 
			{
				count++;
				System.out.print(i+1+" ");
				
			}
			else
			{
				pobj.playerId[i]=0;
			}
			
			
		}
		
		
		if(count>1) {
			System.out.println("has Qualified for the next round and");
			System.out.println(" ");
			System.out.println("***********************Round"+round+"Starts**************************");
			System.out.println("Please provide the Gussing Number in round"+round);
		numFromGuessing=g.GuessingTurn();
		
	
		
		for(int i=0;i<n1;i++)
		{
			int j=0;
			if(pobj.playerId[i]!=0) {
				
				Scanner next=new Scanner(System.in);
				j=i+1;
				System.out.println("Please Enter the Player"+j);
				pobj.playerId[i]=next.nextInt();
				
			}
		}
		
		}
		
	}
	int flag=0;
	for(int i=0;i<n1;i++) {
			if(pobj.playerId[i]!=0)
			{
				int j=i+1;
				flag=1;
				System.out.println("Player"+j+"Won the Game");
			}
		
		}
	if(flag==0)
		System.out.println("No Player Guessed Correctly");
	
		
	
	
}
}
public class Guesser_Game {
	public static void main(String []a)
	{
		Umpireturn U=new Umpireturn();
		U.check();
	}
}
