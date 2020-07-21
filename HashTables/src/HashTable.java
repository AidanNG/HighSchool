//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable()
	{
		table = new LinkedList[10];
		for(int lop =0; lop< table.length;lop++)table[lop]= new LinkedList();
	}

	public void add(Object obj)
	{

		int i = obj.hashCode();
		LinkedList num = table[i%10];
		if(!num.contains(obj))num.add(obj);

	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int i = 0; i<table.length;i++){
			String a = "";
			for(Object obj : table[i]) a+= obj + " ";
			output += "bucket "+i+ " "+ a +"\n";
		}









		return output;
	}
}