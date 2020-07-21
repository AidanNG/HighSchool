import java.util.*;
import java.io.*;

public class groceries {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("groceries.txt"));
        int num = file.nextInt();
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for (int i = 0; i < num; i++) {
            String s = file.next();
            int y = file.nextInt();
            map.put(s,y);
        }
        Map<String,Integer> out = new TreeMap<String,Integer>();
        for(String s: map.keySet()) {
            if (map.get(s) <= 10) {
                out.put(s, map.get(s));
            }
        }
        for(String s: out.keySet()){
            System.out.println(s);
        }
    }
}

