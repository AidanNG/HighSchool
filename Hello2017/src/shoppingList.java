import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class shoppingList {
    public static void main (String[] args) throws IOException{
        Scanner test = new Scanner (new File ("pr69.dat"));
        double total = 0;
        double meat = 0;
        double prod = 0;
        double food = 0;
        double drugs = 0;
        double other = 0;
        String[] fine;
        while(test.hasNextLine()){
            String fun = test.nextLine();
            fine = fun.split(" ");
            if(fine[0].equals("M")){
                meat += Double.parseDouble(fine[1]);
                total += Double.parseDouble(fine[1]);
            }else if(fine[0].equals("P")){
                prod += Double.parseDouble(fine[1]);
                total += Double.parseDouble(fine[1]);
            }else if(fine[0].equals("F")){
                food += Double.parseDouble(fine[1]);
                total += Double.parseDouble(fine[1]);
            }else if(fine[0].equals("D")){
                drugs += Double.parseDouble(fine[1]);
                total += Double.parseDouble(fine[1]);
            }else if(fine[0].equals("O")){
                other += Double.parseDouble(fine[1]);
                total += Double.parseDouble(fine[1]);
            }
        }
        out.printf("Total bill: $  %.2f\n",total);
        out.printf("Meat:     $  %.2f   %.1f%%\n",meat, (meat/total)*100);
        out.printf("Produce:  $  %.2f   %.1f%%\n",prod, (prod/total)*100);
        out.printf("Food:     $  %.2f   %.1f%%\n",food, (food/total)*100);
        out.printf("Drugs:    $  %.2f   %.1f%%\n",drugs, (drugs/total)*100);
        out.printf("Other:    $  %.2f   %.1f%%\n",other, (other/total)*100);


    }

}
