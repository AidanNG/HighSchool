import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class pr21 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(new File("pr21.dat"));
        int team = test.nextInt();
        out.println("WELCOME, TEAM #" + team);
    }
}