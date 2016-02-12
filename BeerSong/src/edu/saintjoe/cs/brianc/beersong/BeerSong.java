package edu.saintjoe.cs.brianc.beersong;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0) { // While there's bottles 
			if (beerNum == 1) { // Correct for one bottle 
				word = "bottle";
				} // endif
			System.out.println(beerNum + "" + " of beer on the wall");
			System.out.println(beerNum + "" + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;
			if (beerNum > 0) { // Adjust for case of no bottles
				System.out.println(beerNum + "" + word + "beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			} // end else
			
		} // end while

	} //end main

} //end class
