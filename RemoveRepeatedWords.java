import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\b\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            StringBuffer result = new StringBuffer();

            while (m.find()) {
                m.appendReplacement(result, m.group(1));
            }
            m.appendTail(result);

            System.out.println(result.toString());
        }

        in.close();
    }
}