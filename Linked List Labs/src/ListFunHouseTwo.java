//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{

		theList = new ListNode(data,theList);

	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count=0;
		ListNode temp = theList;
		while(temp.getNext() != null){

			temp = temp.getNext();
			count++;
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode temp = theList;
		ListNode fun  = temp.getNext();
		temp.setNext(new ListNode(temp.getValue(),fun));

				
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		//ListNode prev=null;
		ListNode temp = theList;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new ListNode(temp.getValue(),null));

	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		int count=0;
		ListNode temp = theList;
		while(temp != null){
			count++;
			temp = temp.getNext();
			if(count%2== 1) temp.setNext(temp.getNext().getNext());
		}


	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count=1;
		ListNode temp = theList;
		while(temp.getNext() != null){
			count++;
			temp = temp.getNext();
			if(count % x == 0) temp.setValue(value);
		}


	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x) {
		int count = 1;
		ListNode temp = theList;
		while (temp != null) {

			if (count == x - 1) {
				count = 0;
				ListNode fun = new ListNode(temp.getValue(), temp.getNext());
				fun = fun.getNext();
				fun = fun.getNext();
				temp.setNext(fun);

			}
			temp = temp.getNext();
			count++;


		}
	}
	//this method will return a String containing the entire list
   public String toString() {
   	String output="";
   	ListNode temp  = theList;
	   while (temp != null) {
		   output += temp.getValue() + " ";
		   temp = temp.getNext();
	   }
	   return output;
   }
	
}