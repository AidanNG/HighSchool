import static java.lang.System.*;
import java.util.*;

public class MyListTester
{
    public static void main(String args[])
    {
        MyList list = new MyList();

        //add some stuff
        list.add("This");
        list.add("does");
        list.add("nothing");
        list.add("but");
        list.add("is");
        list.add("a");
        list.add("really");
        list.add("important");
        list.add("program!");
        for (int i = 1; i < 50; i++)
            list.add(""+i);

        //Uncomment to test add-with-index
        list.add(0,"0");
        list.add(3,"3");
        list.add("THE END");

        //test the toString and size methods
        out.println(list);
        out.println();
        out.println("Size = "+list.size());
        out.println(list.contains("5"));
        out.println(list.clone());


    }
}