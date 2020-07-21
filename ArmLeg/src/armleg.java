import java.io.*;
import java.util.*;

public class armleg {
    public static void main(String[] args) throws IOException{
        Scanner file = new Scanner(new File("armleg.dat"));
        int num = file.nextInt();
        for(int i =0; i< num;i++){
            int arm = file.nextInt();
            int leg = file.nextInt();
            int days = file.nextInt();
            for(int  o = 1; o< days+1;o++){
                if(o%arm == 0&& o%leg==0) System.out.println("ArmLeg");
                else if(o%arm == 0) System.out.println("Arm");
                else if(o%leg == 0) System.out.println("Leg");
                else System.out.println(o);
            }
            System.out.println();
        }
    }
}
