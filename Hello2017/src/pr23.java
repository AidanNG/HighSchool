import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class pr23 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(new File("pr23.dat"));
        int num = test.nextInt();
        double fun = 0.0;
        for (int i = 0; i < num; i++) {
            int cost = test.nextInt();
            fun = (double)cost * 3.52;
            out.printf("$%.2f\n",fun);
        }
    }
}