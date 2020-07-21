//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

import static java.lang.System.*;

public class remover
{
    private ArrayList<String> list;
    private String toRemove;

    public remover(String line, String rem)
    {
        list = new ArrayList<String>(Arrays.asList(line.split(" ")));
        toRemove = rem;
    }

    public void setTest(String line, String rem)
    {
        list = new ArrayList<String>(Arrays.asList(line.split(" ")));
        toRemove = rem;
    }

    public void remove()
    {
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            if(it.next().equals(toRemove)){
                it.remove();
            }
        }
    }

    public String toString()
    {
        return ""+list.toString();
    }
}
