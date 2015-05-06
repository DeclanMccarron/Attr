package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		
		// this is an example of overloading
		ColorAttr testOne, testTwo, testThree;
		Attr testFour, testFive, testSix;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		
		// these colors that are from ScreenColor are examples of overriding
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// the difference between number three and number four is
		//number thee is from ColorAttr and then number four is Attr
		
		// Number four
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		//Number Five
		testFive = new Attr ("ColorFive", "Crimson");
		System.out.println (testFive.toString());
		
		//Number Six
		testSix = new Attr ("colorSix", "Chartreuse");
		System.out.println (testSix.toString());
		
	} // end main
}
