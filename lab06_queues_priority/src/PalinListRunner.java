//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList test = new PalinList("one two three two one");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");
		System.out.println();
		test.setList("1 2 3 4 5 one two three four five");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");
		System.out.println();
		test.setList("a b c d e f g x y z g f h");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");
		System.out.println();
		test.setList("racecar is racecar");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");
		System.out.println();
		test.setList("1 2 3 a b c c b a 3 2 1");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");
		System.out.println();
		test.setList("chicken is a chicken");
		if(test.isPalin()) System.out.println(test+" is a palinlist.");
		else System.out.println(test+" is not a palinlist.");


	}
}