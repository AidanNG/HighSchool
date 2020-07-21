import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class pr25 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(new File("pr25.dat"));
        int num = test.nextInt();
        for (int i = 0; i < num; i++) {
            Double num1 = test.nextDouble();
            Double result = Math.pow(num1, 2) * 6;
            out.printf("%.2f\n", result);
        }
    }
}

