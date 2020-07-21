//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class removerTester
{
    public static void main ( String[] args )
    {
        remover it = new remover("a b c a b c a","a");
        it.remove();
        System.out.println(it);

        it.setTest("a b c d e f g h i j x x x x","x");
        it.remove();
        System.out.println(it);

        it.setTest("1 2 3 4 5 6 a b c a b c","b");
        it.remove();
        System.out.println(it);
    }
}
