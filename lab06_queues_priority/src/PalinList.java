//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue = new LinkedList<String>();
	private Stack<String> stack = new Stack<String>();
	private String[] ray;
	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		ray = list.split(" ");
		for(String s: ray){
			queue.add(s);
		}
		for(int i =0;i<ray.length;i++) stack.push(ray[i]);
	}

	public boolean isPalin()
	{

		while(!stack.isEmpty())
		{
			if(!stack.pop().equals(queue.remove()))return false;
		}
		return true;
	}


	//write a toString method
	public String toString(){
		return Arrays.toString(ray)+"";
	}
}