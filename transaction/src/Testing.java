import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        String inputFile = "src/testing/input.txt";
        String outputFile = "src/testing/output.txt";
        System.out.print("row: ");
        row = input.nextInt();

        // Generate random input data and write to input file
        generateRandomInput(inputFile, row);

        // Measure the time taken to read from the input file and write to the output file
        Instant start = Instant.now();
        readWriteFile(inputFile, outputFile);
        Instant end = Instant.now();

        // Calculate the duration
        Duration duration = Duration.between(start, end);
        System.out.println("Time taken to read and write data: " + duration.toMillis() + " milliseconds");
        System.out.println("File read and write operation completed successfully.");
    }

    public static void generateRandomInput(String filename, int row) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();
            for (int i = 0; i < row; i++) {
                String randomName = generateRandomName();
                int value1 = random.nextInt(100); // Random integer between 0 and 99
                double value2 = random.nextDouble() * 100; // Random double between 0.0 and 99.99
                String line = String.format("CSTAD-%03d %s %d %.1f", i, randomName, value1, value2);
                writer.write(line);
                writer.newLine();
                System.out.println("No: " + i + " " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to generate a random name (replace it with your own implementation)
    public static String generateRandomName() {
        String[] names = {"Sting", "Lay's", "Pepsi", "Coca", "Yogurt", "Candy", "Hanami", "Susi", "Milk", "Beer"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static void readWriteFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
