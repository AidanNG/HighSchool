import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class pr24 {
    public static void main(String[] args) throws IOException {
        Scanner test = new Scanner(new File("pr24.dat"));
        int num = test.nextInt();
        for (int i = 0; i < num; i++) {
            int num1 = test.nextInt();
            int num2 = test.nextInt();
            for(int y = 0; y < num2; y++){
                out.print(num1);
            }
            out.println();
        }
    }
}
