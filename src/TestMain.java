import java.util.Random;

public class TestMain {

	public static void main(String[] args0){
		char [] rij = new char[10];
		Random rng = new Random();

		for(int i =0;i<rij.length;i++){
			rij[i] = (char)rng.nextInt();
		}
		RijBewerkingen test = new RijBewerkingen(rij);
		System.out.println(test.lineair_zoeken(rij[4]));


	}
}
