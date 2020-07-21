//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
    public static void main( String args[] ) throws IOException
    {
        OddEvenSets test = new OddEvenSets("1 5 9 4 6 8 12");
        out.println(test);
        OddEvenSets test1 = new OddEvenSets("3 5 7 17 29 4 6 56 72");
        out.println(test1);
        OddEvenSets test2 = new OddEvenSets("3 6 12 2 28 6");
        out.println(test2);
        OddEvenSets test3 = new OddEvenSets("4 4 4 4 4 4 4 4 ");
        out.println(test3);
        OddEvenSets test4 = new OddEvenSets("1 1 1 1 1 1 1 1");
        out.println(test4);
        OddEvenSets test5 = new OddEvenSets("1 2 3 4 5 6 7 8 9");
        out.println(test5);


    }
}
