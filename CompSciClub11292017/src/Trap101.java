import java.util.*;
import java.io.*;
import java.lang.*;
public class Trap101 {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("trap101.dat"));
        int tests = file.nextInt();
        for(int i  =0; i<tests;i++){
            boolean work = true;
            int totalLeft = file.nextInt();
            int totalRight = file.nextInt();
            int left = 0;
            int right = 0;
            int dist = 0;
            int center =0;
            for(int o =0; o<totalLeft;o++){
                int weight = file.nextInt();
                left+= weight;
                dist++;
                center += (dist*weight);
            }
            dist=0;
            for(int p =0; p<totalRight;p++){
                int weight = file.nextInt();
                right+= weight;
                dist++;
                center -= (dist*weight);
            }
            if(left != right) work = false;
            if(center != 0) work = false;
            if(!work) System.out.println("doesn't work");
            else System.out.println("works");


        }
    }
}
