import java.io.*;
import java.util.*;

public class Solution {
    static int b;
    static int h;
    static boolean flag;
    
    static{
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
        if(b>0 && h>0){flag = false;}
        else{flag = true;}
    }

    public static void main(String[] args) {
        if(flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(b*h);
        }
    }
}