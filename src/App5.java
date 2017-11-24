import java.io.*;
import java.util.*;

public class App5 {

    public static void main(String[] args) throws IOException {

//        StringBuffer buffer = new StringBuffer();
//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        String line;
//        Set<String> set = new TreeSet<>();
//        int i =0;
////        while ((line = reader.readLine()) != null) {
////            //lines.add(line);
////            set.add(lines.equals(lines.))
////            System.out.println(line);
////             i++;
////             //System.out.print(i);
////        }

        Scanner sc = new Scanner(new File("input.txt"));
        Set<String> set = new TreeSet<>();
        while(sc.hasNext()) {
            set.add(String.valueOf(sc.next()));
        }
        for(String e: set)  {
            System.out.println(e);
        }




        }
    }


