import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class ornaments {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(5);
        b.add(3);
        b.add(0, 7);
        b.add(0, 8);
        b.add(6);
        b.set(0, 2);
        b.set(2, 4);
        System.out.println( b );

    }
}
