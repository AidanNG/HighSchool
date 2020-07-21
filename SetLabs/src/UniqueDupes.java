//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.*;

import static java.lang.System.*;

public class UniqueDupes
{
    public static Set<String> getUniques(String input)
    {

        Set<String> uniques = new TreeSet<String>();

        String[] words = input.split(" ");

        for (String y: words) {
            uniques.add(y);
        }




        return uniques;
    }

    public static Set<String> getDupes(String input)
    {
        Set<String> dupes = new HashSet<String>();
        String[] words = input.split(" ");
        Set<String> fun = new HashSet<String>();
        for (String x: words) {
            if(dupes.add(x) == false){
                fun.add(x);
            }
            dupes.add(x);

        }

        return fun;
    }
}
