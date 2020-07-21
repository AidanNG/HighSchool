//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
    public static void main ( String[] args )
    {
        IteratorReplacer it = new IteratorReplacer("a b c a b c","a","+");
        it.replace();
        System.out.println(it);

        it.setEmAll("a b c d e f g h i j x x x x","x","7");
        it.replace();
        System.out.println(it);

        it.setEmAll("1 2 3 4 5 6 a b c a b c","b","#");
        it.replace();
        System.out.println(it);
    }
}
