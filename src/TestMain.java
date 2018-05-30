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
		char [] rij2 = new char[] {'1','2','5','7','8','9'};
		RijBewerkingen test2 = new RijBewerkingen(rij2);
		System.out.println(test2.binair_zoeken('5'));



	}
}
