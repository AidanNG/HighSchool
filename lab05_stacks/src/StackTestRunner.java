//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		StackTest fun = new StackTest("a b c d e f g h i");
		System.out.println(fun);
		fun.popEmAll();
		System.out.println("\n");

		fun.setStack("1 2 3 4 5 6 7 8 9 10");
		System.out.println(fun);
		fun.popEmAll();
		System.out.println("\n");

		fun.setStack("# $ % ^ * ( ) ) _");
		System.out.println(fun);
		fun.popEmAll();
		System.out.println("\n");


	}
}
