import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.*;
import java.util.*;

public class Dictionary {
        public static String end="";
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new TreeMap<String, String>();

        Scanner fun = new Scanner(new File("TextTwist dictionary.txt"));
        String f = "";
        List<String> rap = new ArrayList<String>();
        while (fun.hasNextLine()) {
            f = fun.nextLine();
            rap.add(f);
        }
        Scanner run = new Scanner(new File("TextTwist dictionary.txt"));
        while(run.hasNextLine()){
            f = run.nextLine();
            end = "";
            permutation("",f,rap);

            map.put(f, end);
        }
        System.out.println(map.get("act"));



    }

    public static void permutation(String prefix, String str,List<String>g) {
        int n = str.length();
        if (n == 0) {
            if (g.contains(prefix)) end+=" " + prefix;

        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n),g);
        }
    }
}
