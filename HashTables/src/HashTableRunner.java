//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args ) throws IOException
  {
  	/*Scanner fun = new Scanner(new File("numbers.dat"));


			HashTable list = new HashTable();

			int num = fun.nextInt();
			for(int i =0;i< num;i++){
				Number high  = new Number(fun.nextInt());
				list.add(high);
			}
			out.println(list);*/
  	Scanner fun = new Scanner(new File("words.dat"));
			HashTable list = new HashTable();
			int num = fun.nextInt();
			for(int i =0;i< num;i++){
				Word high = new Word(fun.next());
				list.add(high);

			}
			out.println(list);
  }
}