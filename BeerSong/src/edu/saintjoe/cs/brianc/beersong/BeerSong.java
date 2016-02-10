package edu.saintjoe.cs.brianc.beersong;

public class BeerSong {

	public static void main(String[] args) {
		int beernum = 99;
		String word = "bottles";
		
		while (beernum > 0) {
			if (beernum == 1) {
				word = "bottle";
				}
			System.out.println("Hi mom " + beernum);
			beernum = beernum - 1;
		}// end while

	}//end main

}//end class
