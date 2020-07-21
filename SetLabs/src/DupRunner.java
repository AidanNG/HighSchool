//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
    public static void main( String args[] )
    {
        UniqueDupes test = new UniqueDupes();
        out.println("Orginal List: a b c d e f g h a b c d e f g h i j k");
        out.println("Uniques: "+ test.getUniques("a b c d e f g h a b c d e f g h i j k"));
        out.println("Dupes: "+ test.getDupes("a b c d e f g h a b c d e f g h i j k\n"));

        out.println("Orginal List: one two three one two three six seven one two");
        out.println("Uniques: "+ test.getUniques("one two three one two three six seven one two"));
        out.println("Dupes: "+ test.getDupes("one two three one two three six seven one two\n"));

        out.println("Orginal List: 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
        out.println("Uniques: "+ test.getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
        out.println("Dupes: "+ test.getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6\n"));

    }
}
