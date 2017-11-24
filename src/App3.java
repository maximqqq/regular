import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            //lines.add(line);
            System.out.println(line);

            buffer.append(line);
            buffer.reverse();
        }
        System.out.print(buffer.toString());



    }

}
