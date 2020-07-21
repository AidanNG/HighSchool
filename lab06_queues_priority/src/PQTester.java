//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class PQTester
{
	private Queue<String> pQueue;
	private String[] ray;
	public PQTester()
	{
		pQueue = new PriorityQueue<String>();

	}

	public PQTester(String list)
	{
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue<String>();
		ray = list.split(" ");
		for(String s: ray) pQueue.add(s);

	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		ArrayList<String> fun = new ArrayList<String>();
		fun.addAll(pQueue);
		Collections.sort(fun);
		String output="";
		for(String s: fun)output += s+" ";
		return output;		
	}

	//write a toString method
	public String toString(){
		return pQueue+"";
	}
}