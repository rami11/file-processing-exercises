package exercise2;

import java.io.*;

public class Exercise2 {
    private static final String inputFileName = "in.text";
    private static final String outputFileName = "out.text";

    public static void main(String[] args) {

        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

                String line = reader.readLine();
                while (line != null) {
                    double number = Double.parseDouble(line);
                    writer.write((int) Math.pow(number, 2) + "\n");

                    line = reader.readLine();
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
