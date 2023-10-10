import java.util.Scanner;

public class ColumnSelector {

    public static class CustomObject {
        // Define the structure of your custom object
        // For example, assuming it has an int value
        int value;

        public CustomObject(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 2D array of custom objects
        CustomObject[][] customMatrix = {
            {new CustomObject(1), new CustomObject(2), new CustomObject(3)},
            {new CustomObject(4), new CustomObject(5), new CustomObject(6)},
            {new CustomObject(7), new CustomObject(8), new CustomObject(9)}
        };

        System.out.println("Enter the column index:");
        int columnIndex = scanner.nextInt();

        if (columnIndex >= 0 && columnIndex < customMatrix[0].length) {
            System.out.println("Values in column " + columnIndex + ":");
            for (int i = 0; i < customMatrix.length; i++) {
                CustomObject currentObject = customMatrix[i][columnIndex];
                System.out.println("Row " + i + ": " + currentObject.getValue());
            }
        } else {
            System.out.println("Invalid column index");
        }

        scanner.close();
    }
}