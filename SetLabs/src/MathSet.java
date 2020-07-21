//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
    private Set<Integer> one;
    private Set<Integer> two;

    public MathSet()
    {
        one = new TreeSet<>();
        two = new TreeSet<>();
    }

    public MathSet(String o, String t)
    {
        one = new TreeSet<>();
        two = new TreeSet<>();
        String[] words = o.split(" ");

        for (String y: words) {
            one.add(Integer.parseInt(y));
        }
        String[] second = t.split(" ");

        for (String h: second) {
            two.add(Integer.parseInt(h));
        }
    }

    public Set<Integer> union()
    {
        Set<Integer> uni = new TreeSet<>();
        uni.addAll(one);
        uni.addAll(two);
        return uni;

    }

    public Set<Integer> intersection()
    {
        Set<Integer> inter = new TreeSet<>();
        Set<Integer> inter1 = new TreeSet<>();
        inter.addAll(one);
        for(int i: two){
            if(inter.add(i)== false) inter1.add(i);
        }
        return inter1;

    }

    public Set<Integer> differenceAMinusB()
    {
        Set<Integer> dif = new TreeSet<>();
        dif.addAll(one);
        for (int i:
             two) {
            if(dif.contains(i)) dif.remove(i);

        }
        return dif;

    }

    public Set<Integer> differenceBMinusA()
    {
        Set<Integer> dif = new TreeSet<>();
        dif.addAll(two);
        for (int i:
                one) {
            if(dif.contains(i)) dif.remove(i);

        }
        return dif;
    }

    public Set<Integer> symmetricDifference()
    {
        Set<Integer> fun = new TreeSet<>();
        Set<Integer> fun1 = new TreeSet<>();
        fun.addAll(one);
        for(int i: two){
            if(fun.add(i)== false) fun1.add(i);
        }
        fun.addAll(two);
        for(int x:fun1){
            if(fun.contains(x))fun.remove(x);
        }
        return fun;

    }

    public String toString()
    {
        return "Set one " + one + "\n" +	"Set two " + two +  "\n";
    }
}
