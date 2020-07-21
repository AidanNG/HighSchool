
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class prob02 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("prob02.dat"));
        while (true){
            double v = scan.nextDouble();
            double a = scan.nextDouble();
            double t = scan.nextDouble();
            if(v==0&&a==0&&t==0)break;
            out.printf("%.3f\n",(v*t)+.5*(a*(Math.pow(t,2))));


        }

    }


}
