import java.util.Scanner;

public class LexicoSubstring {

    public static String findSmallestAndLargest(String inputString, int length) {
        String smallest = inputString.substring(0, length);
        String largest = inputString.substring(0, length);
        
        for (int i = 1; i <= inputString.length() - length; i++) {
            String substring = inputString.substring(i, i + length);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            } else if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userString = scanner.nextLine();
        System.out.print("Enter the length of substrings: ");
        int substringLength = scanner.nextInt();

        String result = findSmallestAndLargest(userString, substringLength);
        System.out.println(result);

        scanner.close();
    }
}