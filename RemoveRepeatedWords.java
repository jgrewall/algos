import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String result = s.replaceAll("[,\\n]", "");
        String[] ss = result.split("\\s|'|\\b\\?|!|,\\b|,$");

        System.out.println(ss.length);

        for (String word : ss) {
            System.out.println(word);
        }

        scan.close();
    }
}