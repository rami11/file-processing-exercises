package exercise1;

import java.io.*;
import java.util.InputMismatchException;

public class Exercise1 {

    private static final String inputFilePath = "in.text";
    private static final String outputFileName = "out.text";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line = reader.readLine();
            int count = Integer.parseInt(line);

            int i = 0;
            while (i++ < count) {

                String[] numberStr = reader.readLine().split(" ");
                int sum = 0;
                for (String number : numberStr) {
                    sum += Integer.parseInt(number);
                }

                System.out.println("Writing " + sum + " to " + outputFileName);
                writer.write(sum + "\n");
            }
            System.out.println("Done!");


        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
