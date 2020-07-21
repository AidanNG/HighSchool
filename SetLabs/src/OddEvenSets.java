//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.*;

import static java.lang.System.*;

public class OddEvenSets
{
    private Set<Integer> odds;
    private Set<Integer> evens;

    public OddEvenSets()
    {
        odds = new HashSet<Integer>();
        evens = new HashSet<Integer>();
    }

    public OddEvenSets(String line)
    {
        odds = new HashSet<Integer>();
        evens = new HashSet<Integer>();
        String[] words = line.split(" ");
        int[] fun = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            fun[i] = Integer.parseInt(words[i]);
        }
        for (int i : fun) {
            if (i % 2 == 0) {
                evens.add(i);
            } else if (i % 2 == 1) {
                odds.add(i);
            }
        }
    }

    public String toString()
    {
        return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
    }
}
