//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		setStack("");
		stack = new Stack<String>();
	}

	public StackTest(String line)
	{
		stack = new Stack<String>();
		String[] fun = line.split(" ");
		for(String s : fun) stack.push(s);

	}
	
	public void setStack(String line)
	{
		String[] fun = line.split(" ");
		for(String s : fun) stack.push(s);
	}

	public void popEmAll()
	{
		System.out.println("popping all items from the stack");
		while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
	}

	//add a toString
	public String toString(){
		return stack+" ";
	}
}