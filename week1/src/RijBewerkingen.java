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
		while(index < rij.length){
			if(target == rij[index]){
				return index;
			}
			index++;
		}
		return -1;
	}
	
	
	// als target voorkomt in de gesorteerde rij dan wordt de index van target 
	// teruggegeven; als target niet voor komt dan -1.
	public int binair_zoeken(char target)
	{
		int top = this.rij.length;
		int bottom = 0;
		while (bottom <= top)
		{
			int mid = bottom+((top-bottom)/2);
//			System.out.println(mid);
			if (rij[mid-1] == target)
			     return (mid);
			else
			     if (rij[mid] > target){
			top = mid - 1;
		}
			     else{
			     	top = this.rij.length;
			     	bottom= mid;

		}

		}
		return (-1);
	}

	
	// de rij wordt in oplopende volgorde gesorteerd
	// met de 'bubble-sort'-methode
	public void bubble ()
	{
		// nog afmaken ...
		int ondgrens;
		int loper;
		for (ondgrens = 1; ondgrens < rij.length; ondgrens++)
			for (loper = rij.length - 1; loper >= ondgrens; loper--)
			{
				if (rij[loper - 1] > rij[loper])
				{
					   char tempValue = rij[loper-1];
					   rij[loper-1] = rij[loper];
					   rij[loper] = tempValue;
				}
			}
	}

	
	
	public void print ()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println ("\n\n\n");
	}
	
}

