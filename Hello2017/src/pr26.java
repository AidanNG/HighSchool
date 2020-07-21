import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class pr26 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(new File("pr26.dat"));
        int num = test.nextInt();
        for (int i = 0; i < num; i++) {
            String fun = test.next();
            for(int y  =0; y < fun.length() -1; y = y+2){
                out.println(fun.substring(0,2+y));
            }
            out.println();
        }
    }
}