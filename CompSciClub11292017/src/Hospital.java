import java.util.*;
import java.io.*;
import java.lang.*;
public class Hospital {
    public static void main (String[] args) throws IOException{
        Scanner test = new Scanner(new File("hospital.dat"));
        int testCases = test.nextInt();
        for(int i =0;i<testCases;i++){
            int floors = test.nextInt();
            int rooms = test.nextInt();
            for (int o = 1;o<= floors;o++){
                for (int j = 1;j<= rooms;j++) {
                   System.out.println("floor "+o+" room "+ j);
                }
                }
            System.out.println();
            }

        }
    }

