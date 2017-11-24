import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App1 {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = new ArrayList<>();

//            FileInputStream fstream = new FileInputStream("input.txt");
//            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
//            String strLine;
//            while ((strLine = br.readLine()) != null){
//                System.out.println(strLine);
//            }

        String str = "123rwe123";



        int sum = 0;
        int i = 0;

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find())
        {
            String s = matcher.group(0);
            if(s.replaceAll("\\D", "").length() == s.length())
            {
                integers.add(Integer.parseInt(s));

            }
            sum=sum+ integers.get(i);
            i++;
        }
        System.out.println("Числа в строке"+integers);
        System.out.println("Их сумма"+sum);






    }
}
