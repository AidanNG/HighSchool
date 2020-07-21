
import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class quadratics {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("quadratics.dat"));
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double x = (-1*b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            double y = (-1*b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            System.out.printf("%.3f, ",x);
            System.out.printf("%.3f\n",y);
            scan.nextLine();
        }

    }


}
