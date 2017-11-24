import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {

    public static void main(String[] args) {
        //List<Integer> integers = new ArrayList<>();

        String str = "120.123.12.23 kjkljkljkjklj145.14.55.65;lj";

        Pattern pattern = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");

        Matcher matcher = pattern.matcher(str);
        //Если шабл совпод с люб частью текста
//        while (matcher.find())
//        {
//            //String s = matcher.group(0);
//            //s.replaceAll("(^(\\d{0,255})\\.(\\d{0,255})\\.(\\d{0,255})\\.(\\d{0,255})$)", "ЗАСЕКРЕЧЕНО" );
//          //  matcher.replaceAll("ЗАСЕКРКЧЕНО");
//
//        }
         System.out.print(str.replaceAll("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})", "ЗАСЕКРЕЧЕНО"));
        //System.out.print(str);
    }
    }



