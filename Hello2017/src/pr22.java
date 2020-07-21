import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class pr22 {
    public static void main(String[] args) throws IOException{
        Scanner test = new Scanner (new File ("pr22.dat"));
        int num = test.nextInt();
        for(int i = 0; i < num; i++){
            String food = test.next();

            if(food.equals("PEANUT")){
                out.println("HUNGRY");
            }else{
                out.println("NOT HUNGRY");
            }
        }
    }
}
