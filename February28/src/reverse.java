
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class reverse {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("reverse.dat"));
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            String line = scan.next();
            System.out.println(line.substring(0,scan.nextInt())+line.substring(scan.nextInt()));

        }

    }


}
