import java.util.*;
import java.io.*;
import java.lang.*;
public class Lucky {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("lucky.dat"));
        int tests = file.nextInt();
        for (int i = 0; i < tests; i++) {
            int marv = file.nextInt();
            int harry = file.nextInt();
            int end = file.nextInt();
            for (int o = 1; o <= end; o++) {
                if(o%marv ==0&&o%harry ==0) System.out.println("MarvHarry");
                else if(o%marv ==0) System.out.println("Marv");
                else if(o%harry ==0) System.out.println("Harry");
                else System.out.println(o);
            }
            System.out.println();

        }
    }
}

