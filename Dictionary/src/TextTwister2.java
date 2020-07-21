import java.io.*;
import java.util.*;

public class TextTwister2 {

    private Map <String, Set<String>> WordMap = new TreeMap<String, Set<String>>();

    public TextTwister2() throws IOException{
        Scanner file = new Scanner (new File("TextTwist dictionary.txt"));
        while (file.hasNextLine()){
            String s = file.nextLine();
            String[] letters = s.split("");
            Arrays.sort(letters);
            String newWord = "";
            for (String x: letters){
                newWord += x;
            }
            if (WordMap.containsKey(newWord)){
                Set<String> temp = WordMap.get(newWord);
                temp.add(s);
                WordMap.put(newWord, temp);
            } else {
                Set<String> temp = new TreeSet<String>();
                temp.add(s);
                WordMap.put(newWord, temp);
            }
        }
        file.close();
    }

    public Set<String> getWords (String word, int fun){
        Set<String> words = new TreeSet<String>();
        String[] letters = word.split("");
        Arrays.sort(letters);
        String cool = "";
        for (String s: letters){
            cool += s;
        }
        boolean b = true;
        for (String s: WordMap.keySet()){
            if (s.length() <= cool.length() && s.length() == fun){
                String[] ltrs = s.split("");
                Arrays.sort(ltrs);
                Map <String, Integer> map = new TreeMap<String, Integer>();
                Map <String, Integer> map2 = new TreeMap<String, Integer>();
                for (String a: cool.split("")){
                    if (map.containsKey(a)){
                        int count = map.get(a);
                        count = count + 1;
                        map.put(a, count);
                    } else {
                        map.put(a, 1);
                    }
                }
                for (String c: ltrs){
                    if (map2.containsKey(c)){
                        int count = map2.get(c);
                        count = count + 1;
                        map2.put(c, count);
                    } else {
                        map2.put(c,  1);
                    }
                }
                for (String key: map2.keySet()){
                    b = true;
                    if (map.containsKey(key) && map2.get(key) <= map.get(key)){
                        continue;
                    } else {
                        b = false;
                        break;
                    }
                }
                if (b){
                    for (String x: WordMap.get(s)){
                        words.add(x);
                    }
                }
            }
        }
        return words;
    }

    public Map<String, Set<String>> getWordMap(){
        return WordMap;
    }
}

