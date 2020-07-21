import java.util.*;
import java.io.*;
import java.lang.*;
public class Taxi {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("taxi.dat"));
        int num = file.nextInt();
        for (int i = 0; i < num; i++) {
            int doubles = file.nextInt();
            int x = 0;
            int y = 0;
            int z =0;
            List<person> fun = new ArrayList<person>();
                x=1;
                int star = file.nextInt();
                int en = file.nextInt();
                fun.add(new person(star,en));
                z += en - star;

            for (int o = 0; o < doubles; o++) {
                star = file.nextInt();
                en = file.nextInt();
                if(star< fun.get(0).getEnd() && fun.size()<2) {
                    fun.add(new Person(star, en));
                }
            }
            System.out.println(x+" "+y+" "+z);
        }
    }
    public static class person{
        private int start;
        private  int end;
        person(){
            start=0;
            end =0;
        }
        public person(int st, int ed){
            start = st;
            end = ed;
        }
        public int getStart() {return start;}
        public int getEnd() {return end;}
        public String toString(){return start+ " "+end;}
    }
}
