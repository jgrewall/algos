import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usF.format(payment);
        
        NumberFormat indiaF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaF.format(payment);
        
        NumberFormat chinaF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaF.format(payment);
        
        NumberFormat franceF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceF.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}