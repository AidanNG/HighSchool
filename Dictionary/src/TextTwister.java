import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class TextTwister
{
    private Map<String, TreeSet<String>> wordmap;
    private TreeSet<String> ans;

    public TextTwister() throws IOException
    {
        ans = new TreeSet<String>();
        wordmap = new TreeMap<String, TreeSet<String>>();
        out.println("Loading dictionary...");
        importDictionary();
    }

    public void importDictionary() throws IOException
    {
        Scanner ask = new Scanner(new File("TextTwistDictionary.txt"));
        String item, key;
        TreeSet<String> wordset;
        while (ask.hasNext())
        {
            item = ask.next();
            if (item.length()>2 && item.length()<9)
            {
                key = makeKey(item);
                if (!wordmap.containsKey(key))
                {
                    //key not in map


                }
                else
                {
                    //key already in map



                }
            }
        }
    }

    public String makeKey(String str)
    {
        return "";
    }

/*
 *  Methods to add after Map is tested
 *
	public String getSet(String str)
	{
		return "";
	}

	public void addSet(TreeSet<String> wordset)
	{
		if (wordset == null) return;

		//out.println(wordset);


	}

	public void findAll(String s)
	{

	}

	public void reset()
	{

	}

	public String toString()
	{
		return "";
	}
	*/

    //print out dictionary map
    public void printMap()
    {

    }

    public static void main(String[] args) throws Exception
    {
        TextTwister test = new TextTwister();
        test.printMap();

		/*
		Scanner scan = new Scanner(in);
		out.println("Enter a word...");

		while (scan.hasNext())
		{
			String word = scan.next();
			test.reset();
			out.println(test);
			out.println("Enter a word...");
		}
		*/
    }

}

