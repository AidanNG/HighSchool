//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {

   	while(list != null){
   		out.print(list.getValue()+" ");
   		list = list.getNext();
	}
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	int count=0;
		while(list != null){
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode fun  = list.getNext();
		list.setNext(new ListNode(list.getValue(),fun));

	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{

		ListNode prev=null;
		while(list.getNext() != prev) {
			list = list.getNext();
		}

		list.setNext(new ListNode(list.getValue(),prev));
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		int count=0;
		while(list != null){
		count++;
		list = list.getNext();
		if(count%2== 1) list.setNext(list.getNext().getNext());
	}

	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{

		int count=1;
		while(list.getNext() != null){
			count++;
			list = list.getNext();
			if(count % x == 0) list.setValue(value);
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{

		int count=1;
		while(list != null){

			if(count == x-1){
				count =0;
				ListNode fun = new ListNode(list.getValue(),list.getNext());
				fun = fun.getNext();
				fun = fun.getNext();
				list.setNext(fun);

			}
			list = list.getNext();
			count++;
		}
	}		
}