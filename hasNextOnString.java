import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(scanner.hasNext()){
            count++;
            String nextline = scanner.nextLine();
            System.out.println(count +" "+ nextline);
        }
    }
}