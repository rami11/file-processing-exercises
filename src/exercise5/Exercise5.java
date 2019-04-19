package exercise5;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Exercise5 {

    private static String FILE_INPUT_PATH = "resources/input/dates.txt";
    private static String FILE_OUTPUT_PATH = "resources/output/selection.txt";

    private static File src = new File(FILE_INPUT_PATH);
    private static File dest = new File(FILE_OUTPUT_PATH);

    public static void main(String[] args) {

        try {
            copyDatesOfMonth(src, dest, Month.JULY);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void copyDatesOfMonth(File source, File destination, Month month) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.trim();

                LocalDate date = LocalDate.parse(trimmedLine, DateTimeFormatter.BASIC_ISO_DATE);
                if (date.getMonth().equals(month)) {
                    writer.write(trimmedLine);
                }
            }
        } catch (DateTimeException ex) {
            ex.printStackTrace();
        }
    }

}
