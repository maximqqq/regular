import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App4 {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line = "eeee \"rrrrr\" eeee \"4444\" eeeee eeeeee";
//        List<String> lines = new ArrayList<String>();
//        while ((line = reader.readLine()) != null) {
//            lines.add(line);
//            System.out.println(line);
//
//
//        }

        Pattern pattern = Pattern.compile("\"[^\"]*\"");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
        {

            String s = matcher.group();
            System.out.println(s);
        }

    }
}
