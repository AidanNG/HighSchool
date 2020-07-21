import java.util.*;
import java.io.*;

import static java.lang.System.out;

public class cellPhone1{
    public static void main(String[] args) throws IOException{
        Scanner test  = new Scanner(new File("pr63.dat"));
        int num = test.nextInt();
        int total = 0;
        int[] hours = new int[2];
        int[] min = new int[2];
        for(int i = 0; i< num; i++){
            String string = test.next();
            String[] parts = string.split(":");
            String part1 = parts[0];
            String part2 = parts[1];
            String string2 = test.next();
            String[] parts1 = string2.split(":");
            String part3 = parts1[0];
            String part4 = parts1[1];
            hours[0] = Integer.parseInt(part1);
            min[0] = Integer.parseInt(part2);
            hours[1] = Integer.parseInt(part3);
            min[1] = Integer.parseInt(part4);
            if(hours[0] == hours[1]){
                total += (min[1]-min[0]);
            }else if(hours[1] - hours[0] >=2){
                total += (((hours[1]-1) - hours[0])*60);
                total += ((60-min[0])+min[1]);
            }else if(hours[1] - hours[0] ==1){
                total += ((60-min[0])+min[1]);
            }
        }
        out.println("TOTAL MINUTES: "+ total);
    }
}
