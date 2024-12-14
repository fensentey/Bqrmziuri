/*import java.io.FileInputStream;
import java.io.IOException;
 public class Main {
    public static void main(String[] args) {
        String filePath = "numbers.txt";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println("Reading 10 bytes");

            for (int i = 0; i < 10; i++) {
                int byteValue = fis.read();
                if (byteValue == -1) {
                    System.out.println("End of file reached before reading 10 bytes.");
                    break;
                }
                System.out.println("Byte " + (i + 1) + ": " + byteValue);
            }

        } catch (IOException e) {
            System.out.println("Error reading " + e.getMessage());
        }
    }
}*/

/*import java.io.*;
public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        byte[] numbers = new byte[10];
        int sum = 0;

        try (FileInputStream fis = new FileInputStream(inputFile)) {
            for (int i = 0; i < 10; i++) {
                numbers[i] = (byte) fis.read();
                sum += numbers[i];
            }
        } catch (IOException e) {
            System.out.println("Error while readin: " + e.getMessage());
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            for (int i = 0; i < 10; i++) {
                fos.write(numbers[i]);
            }
            fos.write(sum);
        } catch (IOException e) {
            System.out.println("Error while readin: " + e.getMessage());
        }

        System.out.println("Succesful.");
    }
}*/


/*import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        char[] characters = new char[10];
        int sum = 0;

        try (FileReader fr = new FileReader(inputFile)) {
            for (int i = 0; i < 10; i++) {
                int value = fr.read();
                if (value == -1) {
                    System.out.println("Not enough characters.");
                    return;
                }
                characters[i] = (char) value;
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
            return;
        }

        try (FileWriter fw = new FileWriter(outputFile)) {
            for (int i = 0; i < 10; i++) {
                fw.write(characters[i]);
            }
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        System.out.println("Successful.");
    }
}*/

/*import java.io.*;

public class Main {
    public static void main(String[] args) {
        String outputFile = "numbers.txt";

        int[] numbers = {5, 12, 20, 35, 42};

        try (FileWriter fw = new FileWriter(outputFile)) {
            fw.write(numbers.length + "\n");
            for (int i = 0; i < numbers.length; i++) {
                fw.write(numbers[i] + "\n");
            }

            System.out.println("Successfully written");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputFile = "numbers.txt";

        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < 0) {
                    negativeCount++;
                } else if (number == 0) {
                    zeroCount++;
                } else {
                    positiveCount++;
                }
            }

            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Zero numbers: " + zeroCount);
            System.out.println("Positive numbers: " + positiveCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}*/

/*import java.io.File;
public class Main {
    public static void main(String[] args) {

        String fileName = "numbers.txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            if (file.isFile()) {
                System.out.println("It is a file.");
            }
            if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
            System.out.println("Last modified: " + file.lastModified());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}*/




