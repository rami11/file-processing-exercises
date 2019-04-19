package exercise4;

import java.io.*;

public class Exercise4 {

    private static final String FILE_SOURCE = "ficEntree.txt";
    private static final String FILE_DESTINATION = "voyelles.txt";

    public static void main(String[] args) {

        try {
            copyLowerCaseVowels(FILE_SOURCE, FILE_DESTINATION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyLowerCaseVowels(String src, String dest) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {

            int character;
            while ((character = reader.read()) != -1) {
                if ("aeiou".indexOf(character) > -1) {
                    writer.write(character);
                }
            }
        }
    }
}
