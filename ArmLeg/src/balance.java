import java.io.*;
import java.util.*;

public class balance {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("balance.dat"));
        int num = file.nextInt();
        for (int i = 0; i < num; i++) {
            int left = file.nextInt();
            int right = file.nextInt();
            int Lweight =0;
            int Rweight =0;
            for (int u = 1; u < left+1; u++){
                int w = file.nextInt();
                Lweight+= (u*w);
            }
            for (int u = 1; u < right+1; u++){
                int w = file.nextInt();
                Rweight+= (u*w);
            }
            Boolean safe = (Rweight == Lweight);
            if(safe) System.out.println("safe to lift");
            else System.out.println("unsafe");
        }
    }
}

