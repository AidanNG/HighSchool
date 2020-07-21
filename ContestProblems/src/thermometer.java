import java.util.*;
import java.io.*;

public class thermometer {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("temperature.dat"));
        int num = file.nextInt();
        for (int i = 0; i < num; i++) {
           int jun = file.nextInt();
            int count =0;
           int fin =0;
           while(1==1){
               int time = file.nextInt();
               String temp = file.next();

                count++;
               if(Integer.parseInt(temp,2)>=103){

                   fin = time;
                   break;

               }

           }
           while(count!=jun){
               file.nextInt();
               file.next();
               count++;
           }
            System.out.println(fin);
        }
    }
}
