import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class MowiFields {
    public static void main(String[] args) throws IOException{
        Scanner test = new Scanner (new File ("pr62.dat"));
        int num = test.nextInt();
        int width =0;
        int length = 0;
        double area  =0;
        int hour = 0;
        int min = 0;
        for(int i = 0; i < num; i++){
            width = test.nextInt();
            length = test.nextInt();
            area = (double) width * length;
            area = Math.ceil(area/90);
            hour = (int)area/60;
            min = (int) area%60;
            out.printf("%d:%2d\n",hour,min);


        }

    }
}
