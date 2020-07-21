import java.io.*;
import java.util.*;
import static java.lang.System.*;
import java.lang.Math;
public class BadJava
{
    public static void main(String[] args)  throws IOException{
        Scanner scanner = new Scanner(new File("Data.dat"));
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++); {
            String line = scanner.nextLine();
            String[] split = line.split(" ");

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (String s : split) {
                int j = Integer.parseInt(s);
                if (j > max) max = j;
                if (j < min) min = j;
            }

            double average = (double)(min + max) / 2;
            System.out.printf("%.3f\n", average);
        }
    }
}
