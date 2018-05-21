import java.util.Random;

public class RijBewerkingen
{
	private char [] rij;
	
	
	// constructor
	public RijBewerkingen (char [] rij)
	{
		this.rij = rij;
	}
	
	
	// als target voorkomt in de rij dan wordt de index van target teruggegeven
	// als target niet voorkomt dan wordt -1 teruggegeven.
	
	public int lineair_zoeken(char target)
	{
		int index = 0;
		while(target != rij[index]){

			index++;
		}
		return index;
	}
	
	
	// als target voorkomt in de gesorteerde rij dan wordt de index van target 
	// teruggegeven; als target niet voor komt dan -1.
//	public int binair_zoeken(char target)
//	{
////		// nog afmaken ...
////		int top = ....................;
////		int bottom = 0;
////		while (bottom <= top)
////		{
////			int mid = .....................;
////			if (rij[mid] == target)
////			     return (mid);
////			else
////			     if (.......................)
////			  	top = mid - 1;
////			     else
////			  	.....................;
////		}
////		return (-1);
//	}

	
	// de rij wordt in oplopende volgorde gesorteerd
	// met de 'bubble-sort'-methode
	public void bubble ()
	{
//		// nog afmaken ...
//		int ondgrens;
//		int loper;
//		for (ondgrens = 1; ondgrens < rij.length; ondgrens++)
//			for (loper = rij.length - 1; .....................; loper--)
//			{
//				if (rij[loper - 1] > rij[loper])
//				{
//				   // verwissel rij[loper – 1] en rij [loper]
//				}
//			}
	}

	
	
	public void print ()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println ("\n\n\n");
	}
	
}

