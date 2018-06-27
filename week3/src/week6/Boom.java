package week6;

public class Boom {

	public static void main(String[] args) {
		// Generic class Parameterized with String
//		BKnoop<String> aap = new BKnoop<String>("aap");
//
//		BKnoop<String> noot = new BKnoop<String>("noot");
//		BKnoop<String> mies = new BKnoop<String>("mies");
//		aap.add(noot);
//		aap.add(mies);
//		noot.add(new BKnoop<String>("Wim"));
//		noot.add(new BKnoop<String>("Jet"));

		BKnoop<String> O = new BKnoop<>("O");
		BKnoop<String> A = new BKnoop<>("A");
		A.add(new BKnoop<>("K"));
		A.add(new BKnoop<>("B"));
		BKnoop<String> T = new BKnoop<>("T");
		BKnoop<String> R = new BKnoop<>("R");
		R.add(new BKnoop<>("E"));
		R.add(new BKnoop<>("S"));
		T.add(new BKnoop<>("U"));
		T.add(R);
		O.add(A);
		O.add(T);

		System.out.print("PRE : ");
		O.printPreOrder(O);
		System.out.print("\nPOST: ");
		O.printPostOrder(O);
		System.out.print("\nIN  : ");
		O.printInOrder(O);
//
		System.out.println("\n Aantal knopen : "+O.aantalKnopen());
		System.out.println("\n Aantal leafs : "+O.aantalBladeren());
		System.out.println("\n diepte : "+O.diepte());
		System.out.println("\n hoogte : "+O.hoogte());
		

	}
	
		
	
}
