//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
    public static void main(String args[]) throws IOException
    {
        MathSet test = new MathSet("1 2 3 4 5","4 5 6 7 8");
        out.println(test);
        out.println("union - "+test.union());
        out.println("intersection - "+test.intersection());
        out.println("difference A-B - " +test.differenceAMinusB());
        out.println("difference B-A - " +test.differenceBMinusA());
        out.println("symmetric difference "+test.symmetricDifference());
        out.println();

        MathSet test1 = new MathSet("10 11 12 13 14 15 16 17","11 13 15 17 19 21 23");
        out.println(test1);
        out.println("union - "+test1.union());
        out.println("intersection - "+test1.intersection());
        out.println("difference A-B - " +test1.differenceAMinusB());
        out.println("difference B-A - " +test1.differenceBMinusA());
        out.println("symmetric difference "+test1.symmetricDifference());
        out.println();

        MathSet test2 = new MathSet("4 5 5 6 76 7 7 8 8 8 8 8","23 3 4 3 5 3 53 5 46 46 4 6 5 3 4");
        out.println(test2);
        out.println("union - "+test2.union());
        out.println("intersection - "+test2.intersection());
        out.println("difference A-B - " +test2.differenceAMinusB());
        out.println("difference B-A - " +test2.differenceBMinusA());
        out.println("symmetric difference "+test2.symmetricDifference());
        out.println();
    }
}
